public class Day09Work03 {

   
	public static void main(String[] args){
	
	    int k=multiple();
		System.out.println(k);

	}
	public static int multiple(){
	
	    
		java.util.Scanner get=new java.util.Scanner(System.in);
        System.out.print("������׳����� ");
		int num=get.nextInt();
        


		int n=1;
		for(int m=num;m>0;m--){    //100�Ľ׳�ֵ����intȡֵ��Χ�������Ϊ0���Ժ���׳�ʱע�⣬��Ҫ������ֵ���͵�ȡֵ��Χ��
		   
		   n*=m;
		
		}
		
		return n;
	
	}

}



