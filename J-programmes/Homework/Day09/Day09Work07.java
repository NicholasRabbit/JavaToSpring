public class Day09Work07 {

    public static void main(String[] args){
	
	     sum(1000);

	}

	public static int sum(int x){
	     
	    
		 for(int m=1;m<=x;m++){          //�˴�m=1��2��ʼ�����ԡ�����1�Ļ����ڲ�forͨ������Ȼ�����һ��2��3,4����
		     int k=0;
		     for(int n=1;n<=m/2;n++){    //�˴������n=1��ʼ����Ϊ1Ҳ��һ�����������ܴ�2��ʼ��
			 
			     if(m%n==0){
				 
				    k+=n;
				 }
			 }
			 if(m==k){
			 
			    System.out.println("�����ǣ� "+m);
			 }

		 }

         return x;
	}

}