public class Day16Work01{

    public static void main(String[] args){
	
	    A a=new A(100);
		B b=new B();

		b.compare(90);
	
	}

}


class A {

    int v;
	
	public A(){
	
	}
	public A(int v){
	
	    this.v=v;
		System.out.println(v);
	}

}

class B extends A {

	A a; 
	//int k=a.v;     //�˴�������󣬳��ֿ�ָ���쳣����Ϊa�в�û���κε�ַָ�����
        
    public void compare(int w){
	    System.out.println(k);
	    if(w==k){
		
		    System.out.println("�¶��ˡ�");
		}else if(w<k){
		
		    System.out.println("С��");
		}
	}

}