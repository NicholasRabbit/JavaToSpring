public class BreakTest003{
    public static void main(String[] args){
	
	     for(int e=10;e>0;e-=1){
		 
		     for (int f=15;f>0;f--){
			 
			     if(f==7&e==8){              //ע��e==8�Ǵ�ѭ��ʱ��������ݣ�����ע��˴��߼����Ϊ�߼��������
				                             //�߼����Ϊ�߼�����ôe==8�Ǵ�ѭ��ʱ,fʲô�������
				   break;
				 }
			 
			     
				 System.out.println(f);
			 }
		 
		    System.out.println(">>>>>>>>>>>"); 
		 }
	
	     System.out.println("�����߼�������");
		 
		 for(int e=10;e>0;e-=1){
		 
		     for (int f=15;f>0;f--){
			 
			     if(f==7|e==8){              
				                             //�˴��ĸ�Ϊ�߼�����ôe==8�Ǵ�ѭ��ʱ,fʲô�������
				   break;
				 }
			 
			     
				 System.out.println(f);
			 }
		 
		    System.out.println(">>>>>>>>>>>"); 
		 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	}



}
/*                                 
15
14
13
12
11
10
9
8
>>>>>>>>>>>    �߼������for�ڰ˴ν��
*/
/*15
14
13
12
11
10
9
8
7
6
5
4
3
2
1
>>>>>>>>>>>       �������
*/