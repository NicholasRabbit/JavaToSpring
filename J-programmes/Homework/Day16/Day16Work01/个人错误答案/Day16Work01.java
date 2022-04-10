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
	//int k=a.v;     //此处编译错误，出现空指针异常，因为a中并没有任何地址指向对象。
        
    public void compare(int w){
	    System.out.println(k);
	    if(w==k){
		
		    System.out.println("猜对了。");
		}else if(w<k){
		
		    System.out.println("小了");
		}
	}

}