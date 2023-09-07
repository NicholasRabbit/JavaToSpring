public class WhileTest002 {

    public static void main(String[] args){
	
	    WhileTest002.saveMoney01(10);
		            saveMoney02();
					saveMoney03();
	
	}

	public static int saveMoney01(int a){    //练习形式参数列表，此行无意义。
	    
		float k=0f;
		
		for(int n=1;;n++){
		
		    
			if(n%5==0){
			
			   k=k+6f;
			}
			if((2.5*n-k)>=100f){
			
			   System.out.println(n+"天存了"+(2.5*n-k)+"元");
			   break;
			}
		
		}
		return a;  //练习返回值，此行无意义。
	}


	//上题用while语句写：

	public static void saveMoney02(){
	
	    int day=0;
		double money=0.0;

        while(true){
		    
			day++;
			money+=2.5;
            
			if(day%5==0){
			
			   money-=6.0;
			}
			if(money>=100.0){
			
			    System.out.println("while语句的天数结果："+day);
			    break;
			}

		}

	}

	//上面while的优化写法：
	public static void saveMoney03(){
	    int day=0;
		double money=0.0;
	    while(money<100.0){       //此处当money数值大于100时，就不执行了，下面Sout输出天数
		    day++;
			money+=2.5;
			if(day%5==0){
			
			    money-=6.0;
			}
		}

		System.out.println("while优化后语句天数结果："+day);
	}

}