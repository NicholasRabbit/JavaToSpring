public class ExtendsTest003 {

    public static void main(String[] args){
	
	     D d=new D();
		 char a=d.methodA('D');   //�����̳з����������½�����D�����õ���D��ġ�System.out.println(d)��   
	}                             //D�̳���C��C�̳���B,B�̳���A
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

