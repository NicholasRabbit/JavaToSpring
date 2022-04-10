public class ParameterTest002{
    
	public static void main(String[] args){
	    Human h=new Human(30);                     //构造方法，生成对象，此处main方法里的h保存的是new Huamn(30)的地址，然后传给了下面plus方法里的h,
		                                           //这两个h在不同方法里，在栈内存是两块不同的内存空间,
		                                           //两个h自身的地址不同，但它们保存的地址相同,保存的都是Human对象的地址
		ParameterTest002.plus(h);                  //调用plus方法,实参为h,其内是一个对象地址，是个特殊的值,是从上面的h里传过来的地址。
		System.out.println("main-----> "+h.age);   //输出21。

	
	}
	public static void plus(Human h){              //形式参数列表(Human h)类似于(int i),只不过i里面是字面值，而h里保存的是对象的地址。            
	    h.age++;                                   //h.age=age+1,就是(h.age=30+1)即给实例变量赋值。
		System.out.println("plus-----> "+h.age);   //输出21。

	
	}

}
class Human{
    int age;
	
	public Human(int m){
	    age=m;
	
	}
	

}