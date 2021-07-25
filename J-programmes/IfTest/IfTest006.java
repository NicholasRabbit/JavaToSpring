public class IfTest006{
	public static void main(String[] args){
	boolean gender=true;
			if (gender) 
				System.out.println("男");           //如果if后没加大括号，则它只包括后面一行
			                                        
				System.out.println("独立一行");     //此行不包括在if内，正确格式应往前缩进
			
			else{                                   //因此此行错误，else找不到if,被上行隔断
				System.out.pringln("能否输出？");   //else不可独立存在
			}
	}
}