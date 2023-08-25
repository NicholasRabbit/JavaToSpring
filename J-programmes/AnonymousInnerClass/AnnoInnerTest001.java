public class AnnoInnerTest001 {

    public static void main(String[] args){
	    
		Computer c=new ComputerImpl();    //��̬
		MyCaculator mc1=new MyCaculator();
		mc1.sum(c,100,200);    //����MyCaculator���sum()������͡�

		/*
		�������������ڲ��෽ʽд������ͣ�
		һ������½ӿ�Computer������new����
		��������new Computer(){...}����һ�������ڲ���(AnnoInnerTest001$1)��
		û�����֣�ֻ��ʵ���˽ӿ�Computer��ķ�����������ȥд�����ֵ���ȥʵ�ַ����ˡ�
		
		*/
		MyCaculator mc2=new MyCaculator();
		mc2.sum(
			new Computer(){
				public int plus(int a, int b){
					return a+b;
				}   
			},
			100,
			200);
							               
		                        
	
	}

}

interface Computer {

   public abstract int plus(int a, int b);

}

class ComputerImpl implements Computer{     //�������࣬ʵ�ֽӿ���ķ�����
     
   public int plus(int a, int b){
   
       return a+b;
   } 

}
class MyCaculator {

   public void sum(Computer c, int a, int b){
       int retValueOfPlus=c.plus(a,b);
	   System.out.println("���ǣ�"+retValueOfPlus);
   
   }

}
