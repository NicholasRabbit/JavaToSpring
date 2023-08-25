public class SuperTest004 {

    public static void main(String[] args){
	
	   
	}

}

class Father {

	int age;

	public Father (int age){     
	    this.age=age;            
		                         
	}
}

//父类中只有一个手写有参构造方法，那么子类中必须手写一个super(有参)去调用父类这个构造方法，否则报错                                           
//如果子类什么也不写，则系统默认给一个无参构造，里面带有一个默认给的super(),因为super()没有参数，无法                                         
//调用父类的有参构造方法，因此报错，因为父类中手写有参构造，无参构造不手写就没有了,子类无参的super()就没法调用。                            
class Son extends Father {
    
    public Son(){
	    super(10);
	}

	public Son(int age){
	    super(age);
	}


}
