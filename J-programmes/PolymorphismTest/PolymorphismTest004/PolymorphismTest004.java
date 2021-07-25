public class PolymorphismTest004 {

/*
Person父类，Son子类，在子类中重新声明变量name的情况下
变量是静态态绑定，方法是动态绑定。
静态绑定就是变量本身什么类型，就用哪个里面的。
例如，你的p.name的p是Person类型，那么name就是Person类中的name。
而如果是动态绑定，那么会从本身类型开始向超类型查找。
如果name是方法，那么用于p是Son类的一个对象，所以会从Son开始找name方法，如果找不到再到父类中找。

*/
    
	public static void main(String[] args){
	
	    Father f=new Son();
		System.out.println(f.age);   //结果为0。因为在子类Son中重新声明了age,并赋值，虽然多态语法下，父类f引用含有内存地址指向子类，
		                             //但是在编译阶段f静态绑定了父类的属性age，因为编译器编译时发现有两个name, f属于父类Father
									 //因此f.age是0.
        
		Father f2=new Son02(25);     //Son02这个子类的属性age没有重新声明 
		System.out.println(f2.age);  //这里结果为25，子类中没有重新声明age,而是使用有参构造方法赋值，方法属于动态绑定，
		                             //f2在运行阶段，动态绑定了子类中的age。
	
	}


}

class Father {
    
    int age;
}

class Son extends Father{
	int age=10;
}

class Son02 extends Father{
	
	public Son02 (){       //这里age没有重新声明。
	
	}
	public Son02 (int age){
	   this.age=age;
	}
}