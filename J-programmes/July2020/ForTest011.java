public class ForTest011{
    public static void main(String[] args){
	     int m;
	      
		 for(m=2;m<=10;m++){
		 
		     for(int n=2;n<m;n++){
			     if(m%n==0){
				 
				   break;
				 
				 }
				 else{
				     System.out.println(m);  
			     }
			 }
		 }
	     

/* �������������� �����ҳ�����������,����
   m,n ������ȡֵ1
   û��2����Ϊ2n<m2�������ڲ�forѭ��
3  3%2!=0����else�����m=3
5  5����2,3,4�������㣬else�������������3�Σ�����7ͬ��
5   
5
7
7
7
7
7
9  9�ȸ�2������������ȥif�Ȼ���3����������ȥ�ˣ�Ȼ��break��ϣ���˺���Ĳ�ִ����
   �������ؼ�����һƱ����ƣ���ֻҪ��һ������С�����Ĳ���1�����������Ͳ�����������������
   else���Ƕ�����ڲ�forѭ�������������Ǵ���ģ���Ҫ�ò������ʽ����
*/

//��������ȷ�𰸣�

         System.out.println("�ָ���~~~~~~~~~~~~~~~~~~~");
		 int count=0;                  //ÿ8��һ���мӴ��к��������,
		 for(int a=2;a<=100;a++){      //count=0����д��,����ÿ��ѭ������
		     
			 boolean beZhiShu=true;   //�˴�����   ���ʽҪд�����forѭ�����
			 for(int b=2;b<a;b++){    //��ΪҪ������ֵ�������if��䣬���a��ֵ
			     if(a%b==0){
				    beZhiShu=false;
					break;
				 
				 }
			 
			 }
		 
			 if(beZhiShu){
				  
				 System.out.print(a+" ");
				 count+=1;                 //ÿ8��һ���У�count�Լ�һҪдbeZhiShuΪ������
			     if (count==8){            //��д����ߣ���100�������Ƿ���������8��һѭ��
			     System.out.print('\n');   
				 count=0;                  //count==8����д��count%8==0,����count=0����Ҫȥ��
			     }
			 }                             
		     
		 
		 }
   






	}
}