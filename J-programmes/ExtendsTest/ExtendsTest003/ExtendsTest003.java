public class ExtendsTest003 {

    public static void main(String[] args){
	
	     D d=new D();
		 char a=d.methodA('D');   //连续继承范例，这里新建对象D，调用的是D里的“System.out.println(d)”   
	}                             //D继承于C，C继承于B,B继承于A
}

class A{
    
	public  char methodA(char d){
	    
	    System.out.println(d);
		return d;
	}
}

class B extends A{

}

class C extends B{

}

class D extends C{
   
    
}

