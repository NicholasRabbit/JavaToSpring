public class IfTest002{
    public static void main(String[] args){
        double  m=70;
        if(m>90&m<=100){                   //注意逻辑或&的用法，此处用短路或&&可提高运算效率
			System.out.println('A');       //成绩大于90小于等于100
		}else if(m>80&m<=90){              //成绩大于80小于等于90
			System.out.println('B');
		}else if(m>60&m<=80){              //60<m<=80
			System.out.println('C');  
		}else if(m<60&m>=0){               //m<60
			System.out.println('D');
		}else /*if(m<0|m>100)*/{           //多行注释内可加可不加，效果一样
		    System.out.println("输入错误，请检查输入分数是否正确。");
		}   

         m=50;
		String  level="A";              //以上程序简洁写法，加入字符串变量
        if(m>90&m<=100){                  
			level="A";       
		}else if(m>80&m<=90){              
			level="B";
		}else if(m>60&m<=80){              
			level="C";  
		}else if(m<60&m>=0){               
			level="D";
		}else /*if(m<0|m>100)*/{           
		    level="输入错误，请检查输入分数是否正确。";
		}
		System.out.println(level);      //注意最后不要忘记此行输出"level"语句
 



  }
}