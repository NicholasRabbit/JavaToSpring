public class Homework006 {

    public static void main(String[] args){
	
	    java.util.Scanner distance=new java.util.Scanner(System.in);
		System.out.print("请输入距离： ");
		int d=distance.nextInt();
		double m=cost(d);                    
		System.out.println("打车费用："+m);
	}

	public static double cost(int d){
	    double k;
	    if(d<=3){
		    k=8;
		   
		}else if(d>3&d<=5){
		    k=8+1.2*(d-3);
		 
		}else {
		
		    k=8+1.2*(5-3)+1.5*(d-5);
		   
		}
        return k;
	}

}