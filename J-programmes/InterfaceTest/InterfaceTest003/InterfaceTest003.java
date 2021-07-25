public class InterfaceTest003 {

    public static void main(String[] args){
	
	    A a=new D();     //多态语法。
		B b=new D();
		C c=new D();

		a.mA();        //正常调用D对象里实现的A接口里的方法。
      
	  //a.mB();        //A接口a引用调用B里的方法，不符合语法编译通不过，即使a指向D()对象，D里有mB()方法也不行
	    B b2=(B)a;     //强制类型转换为B类型就可以，接口A,B之间没有继承关系也可以转换。
        b2.mB();

		D d=(D)a;     //也可以父类向子类强制转换，调用mB();
		  d.mB();
	}

}

interface A{
  public void mA();
}

interface B {
  public void mB();
}

interface C {
  public void mC();
}

class D implements A,B,C {
    
  public void mA(){
      System.out.println("接口A的mA方法实现");
  }

  public void mB(){
      System.out.println("接口B的mB方法实现");
  }

  public void mC(){
      System.out.println("接口C的mC方法实现");
  }

}