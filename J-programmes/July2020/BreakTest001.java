public class BreakTest001{
    public static void main(String[] args){
	    for(int b=0;b<=10;b++){
		
		    if(b<6){
			
			    break;
			}
		
		   System.out.println(b);    //���в���ִ�У���Ϊ����� <6��
		                             //����0��ʼ�ʹ���ˣ���˲�������κ�ֵ
		}
		
        System.out.println("�ָ���>>>>>>>>>>>>>>>>>>>>>>");

        for1:for(int c=0;c<10;c++){
		
		         for2:for(int d=0;d<5;d++){      
				 
				     if(c==4){                     //ע��break��ѭ�������ڲ�ͬ����µ��÷�
					 
					    break for2;
						//System.out.print("check");  //break�ն�forѭ���Ժ󣬺�ߵĳ���Ͳ�ִֻ���ˣ��˴�����
					 }
				     System.out.println(d);
					 
				 
				 }
				 
		
		}
	
	
	
	}


}