public class Day10Work03 {

    public static void main(String[] args){
	
	    int b=multipleTest(10);
		System.out.println(b);
	}

	public static int multipleTest(int x){     //����1!+2!+....+10!�ĺ�
	
	    int k=0;
		for(int a=1;a<=x;a++){
		    
			int m=1;
			for(int n=1;n<=a;n++){
			
			   m*=n;
			}
			k+=m;
		
		}
		return k;
	}

}