public class Day11Work02 {

    public static void main(String[] args){
	
	    int k=A.sum(20);
		System.out.println(k);
	}


}

class A {

    public static int sum(int n){
	
	   int a=n;
       
	   boolean isPrime=true;
	   while(isPrime){
	       isPrime=false;  //�˴�����Ŀ�ģ���if(a%b==0)��䲻ִ��ʱ����if(!isPrime)���ִ�У�ʹwhileѭ��ֹͣ��
		                   //�Ӷ���֤a�Ǵ���n����С������
		   a++; 
	       for(int b=2;b<a;b++){
		   
		       if(a%b==0){
			     isPrime=true;
			     break;
			   }
		   }
		   if(!isPrime){
		   
		       break;
		   }
		 

	   }

	   return a;
	
	}

}