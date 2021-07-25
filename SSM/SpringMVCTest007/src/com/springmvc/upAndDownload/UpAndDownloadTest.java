package com.springmvc.upAndDownload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UpAndDownloadTest {
	
	
	//一，浏览器从服务器下载文件代码写法，固定格式
	@RequestMapping(value="/download")
	public ResponseEntity<byte[]> downloadTest(HttpSession session) {
		String realPath=session.getServletContext().getRealPath("photos");    //这里是获取项目根目录下“photos”文件夹的实例路径，即在电脑里的绝对路径，如果要获取photos/europe的路径，直接写进去就行
		String finalPath=realPath+File.separator+"10.jpg";                    //拼接该目录下要下载的文件的绝对路径                  
		
		InputStream in=null;
		byte[]  bytes=null;
		try{
			 in=new FileInputStream(finalPath);
			bytes=new byte[in.available()];     //设定byte数组的容量与所读取的文件大小一致，避免浪费存储空间
			in.read(bytes);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(in !=null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		//设置请求头,固定写法
		HttpHeaders headers=new HttpHeaders();
		headers.add("Content-Disposition", "attachment;filename=10_for_download.jpg");   //filename后的值是为下载的文件设置一个默认的名字
		//设置响应状态
		HttpStatus  statusCode=HttpStatus.OK;
		//调用ResponseEntity的有参构造，把上面的参数放进去
		ResponseEntity<byte[]> entity=new ResponseEntity<byte[]>(bytes,headers,statusCode);   
		
		return entity;
	}
	
	/*二，(1)上传文件写法，先使用io流进行复制上传文件
	 * 注意上传文件要用到commons-fileupload-1.3.1.jar和commons-io-2.2.jar两个包
	 * 否则报异常： java.lang.ClassNotFoundException: org.apache.commons.fileupload.FileItemFactory
	 */
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String uploadTest(String description, MultipartFile uploadFile, HttpSession session)  {
		
		String originalName=uploadFile.getOriginalFilename();     //获取浏览器上传文件的原始名字
		String filePath=session.getServletContext().getRealPath("photos/upload_file")+File.separator+originalName;   //进行字符串路径拼接，把上传的文件按原名字放到：根目录/photos/upload_file里面
		
		/*注意：上传到的目录filePath是以下的路径，不是从左边的目录photos/upload_file里找，找不到而是从filePath里找，下面即使sout输出filePath的结果
		 * EclipseProject01\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\SpringMVCTest007\photos\IMAG0035.jpg
		 * */
		System.out.println("上传文件保存路径==>"+filePath);  
		InputStream in=null;
		OutputStream out=null;
		try {
			//获取输入流
			in=uploadFile.getInputStream();

			//获取输出流
			out=new FileOutputStream(filePath);
			
			byte[] bytes=new byte[1024];  //1kb=1024bytes,每次复制1kb，直到复制完
			while(true){
			    int readCount=in.read(bytes);
				if(readCount==-1){
				    break;
				}
				out.write(bytes,0,readCount);
			}
			
			out.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			if(in !=null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(out !=null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return "done";
	}
	
	/*二，(2)使用Spring框架封装的IO流来上传文件，上传的文件也在(1)中的位置
	 * */
	@RequestMapping(value="/uploadNew", method=RequestMethod.POST)
	public String uploadBySpring(String desc,MultipartFile uploadFile,HttpSession session) {
		String  originalName=uploadFile.getOriginalFilename();

		//如果有重名的文件，这里随机生成一个文件名，加号"+"后面的是截取后缀拼接，
		//不重命名也可以，新文件会覆盖同名旧文件
		String  renameFile=UUID.randomUUID()+originalName.substring(originalName.lastIndexOf("."));  
		
		String  filePath=session.getServletContext().getRealPath("photos/upload_file")+File.separator+ renameFile;
		
		File file=new File(filePath);   //创建目的路径文件对象，即要复制到的位置
		try {
			uploadFile.transferTo(file);    //把接收到的文件转换为目的路径的文件，接收到的文件封装在MultipartFile对象uploadFile里
		} catch (IllegalStateException e) {   
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "done";
	}
	
}
