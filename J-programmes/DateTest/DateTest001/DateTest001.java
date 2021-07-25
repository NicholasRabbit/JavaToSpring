
import java.util.Date;                 //Date类属于java.util下面的，需手动导入，不是java.lang包下的自动导入类。
import java.text.SimpleDateFormat;     //SimpleDateFormat属于java.text下面的

public class DateTest001 {

    public static void main(String[] args) throws Exception {
	
	    
		//Date类型转换为String类型输出,因为重写了toString方法
		Date  time=new Date();     //日期类Date范例
		System.out.println(time);  //输出时间，默认格式：Thu Oct 29 14:22:40 CST 2020，time是Date类引用，没有输出默认地址，说明Date类里重写了toString方法。

		
		SimpleDateFormat  sd=new SimpleDateFormat("yyyy年MM月dd日");  //设定输出日期格式,注意：yyyy代表年写四位，MM,dd同理，这几个字母是固定格式，其他的字可自定义

		String newDate=sd.format(time);  //把上面Date类对象time改为这种格式，返回值StringBuffer类型 
		System.out.println(newDate);     //输出：2020年10月29日


		//String类型转换为Date类型
		String newTime="2020-9-10-02:30:25.656";
        SimpleDateFormat  sdf=new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss.SSS");
		Date newDate2=sdf.parse(newTime);
		
		System.out.println(newDate2);   //输出Thu Sep 10 02:30:25 CST 2020  ,格式与设定格式不一致，因为还没有使用String newDate=sdf.format(newDate2)
		                                //注意前面main方法加throws Exception，否则无法编译，原因后面讲。
        


	
	}

}