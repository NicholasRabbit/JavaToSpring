public class PolymorphismTest001 {

    public static void main(String[] args){
	     
		 Animal a1=new Dog();    //a1����Animal�࣬�Ǹ��࣬new Dog()�������Ͷ���
	            a1.move();       //�˴���������������������ת����java������ת�����Զ�ת��������b1ͬ��

         Animal b1=new Bird();
		        b1.move();       
	
	     Animal a2=new Dog();
		    //  a2.bark();       //a2����Animal�࣬Animal����Dog�ĸ��࣬"new Dog()"�����������,"bark()"�������еķ���
			                     //"a2.bark()"�������ڸ���������ת��,�����ǿ������ת�����ſɣ�������(Dog)
			Dog d2=(Dog)a2;      
			    d2.bark();

         
		 
		 
		 Animal a3=new Bird();   
		    
			//Dog d3=(Dog)a3;    //���б���ͨ�������б�����java.lang.ClassCastException��������һ���������쳣,
		                         //��Ϊa3����Animal�࣬����ʱ�﷨û�д��󣬵��ں������ʱa3ָ�����Bird()����
								 //��Dog���Bird��֮��û�м̳й�ϵ���ã�Dog��ǿ��ת����d3ָ��Bird()����������д���
	
	     System.out.println("�ָ���~~~~~~~~~~~~~~~~~~~~~~");
		 
		 if(a3 instanceof Dog){         //��˼�ǣ�a3�ĵ�ַָ��Dog��Ķ���
		 
		      Dog d3=(Dog)a3;
			      d3.bark();

		 }else if(a3 instanceof Bird){  //��˼�ǣ�a3�ĵ�ַָ��Bird��Ķ���
		 
		     Bird b3=(Bird)a3;
			      b3.sing();
		 }
	}

}