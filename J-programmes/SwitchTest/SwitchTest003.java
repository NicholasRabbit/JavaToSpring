public class SwitchTest003{
    public static void main(String[] args){
			java.util.Scanner s=new java.util.Scanner(System.in);
			
			System.out.print("请输入第一个数字：");
			int number01=s.nextInt();
			
			System.out.print("请输入运算方法：");
			String operator=s.next();
			
			System.out.print("请输入第二个数字：");
			int number02=s.nextInt();

			int result=0;   //随意赋值，不赋值则大括号外的Sysrem.out语句里的result没有值,
                            //有加号也是字符串运算符，不做求和，因此会报错。
			switch(operator){
			   case "+":
			   result=number01+number02;
			   break;

			   case "-":
			   result=number01-number02;
			   break;

			   case "*":
               result=number01*number02;
			   break;

			   case "/":
               result=number01/number02;
			   break;

			   case "%":
               result=number01%number02;
			   break;
			   default:
				   System.out.println("输入错误");

			


			}
			
			System.out.println(number01+operator+number02+'='+result);
			//注意，result的结果不是在这里算出来的，这里的+号已经变成了字符串连接符
			//所有的因为有'='和字符串连接符+，都变成了字符串
			//其结果是有上面case中表达式算出来的，这里写成这样只是为了显示如10+20=30这个形式

	      
	}

}

