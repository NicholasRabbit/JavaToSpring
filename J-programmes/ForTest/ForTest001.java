public class ForTest001{
   public static void main(String[] args){
      for(int a=0;a<10;a+=1){                 //�˴���дa=++a��a++������д��a=a++�������ȸ�ֵ�����Լ�һ��������ѭ��
	      System.out.println(a);
	  }
	  System.out.println("~~~~~~~~~~~~~~~~");

	  
	  
	  int b;
	  for(b=0;b<20;b+=2){
	      if(b%2==0){                        //�����������һ����==��������һ���Ⱥ�=�����ڸ�ֵ��������ᱨ��
		     System.out.println(b);
		  } 

	  }
	  
	  System.out.println("~~~~~~~~~~~~~~");


	  
	  int c=0;              //int c=0���������渳ֵ��for��һ���ֺ�ǰ����ʲôҲ��д
	  for(;c<10;c+=2){
	  System.out.println(c);
	  }


      

       

	  
   
   }


}
