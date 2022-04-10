public class ArrayTest003 {

    public static void main(String[] args){
	
	    System.out.println(args.length);    //运行时java ArrayTest003后什么也不写，这里输出0，即String[]数组长度为0，里面什么元素也没有。
		
		for(int m=0;m<args.length;m++){
		
		    System.out.println(args[m]);    //运行时在"java ArrayTest003"后输入:" abc 你好 ...."等等Sring类型数值,这里会输出打印出来。
		}

		if(args.length!=2){
		    System.out.println("输入错误，请输入用户名和密码:");
			return;
		}
		
		
		String username=args[0];
		String code=args[1];
		if(username.equals("root")&code.equals("12345")){
		    System.out.println("欢迎回来，登录成功");
		}else{
		    System.out.println("密码或用户名错误");
		}

	
	}

}