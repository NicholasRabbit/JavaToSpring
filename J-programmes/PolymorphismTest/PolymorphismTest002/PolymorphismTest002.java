public class PolymorphismTest002{

    public static void main(String[] args){
	
	     Master m=new Master();
		 Cat tom=new Cat();       //����Ҳ��д��Pet tom=new Cat(),��������������ת���������Զ�ת��
		     m.feed(tom);


         Dog jack=new Dog();
		     m.feed(jack);

	}
}