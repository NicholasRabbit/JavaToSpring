public class SonClass extends FatherClass {

    int age=20;
	String name="Son";
	
	public SonClass(){
	   //super();           //javaϵͳĬ�ϸ�һ��super()�����ø����޲ι��췽����д��д����
	}

	public void method(){
	  
	  System.out.println(this.name);  //��������е�����"Son"

	  System.out.println(super.name); //super.nameǿ�Ƶ��ø����е����ԣ�"Father"
	}




}