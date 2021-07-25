public class ExtendsTest004 {

    public static void main(String[] args){
	
/*
子类不能继承父类的私有属性，但是如果子类中公有的方法影响到了父类私有属性，
那么私有属性是能够被子类使用的
*/
		
		
		Son s=new Son();
		//s.age=10;      //编译报错，不能通过子类直接继承,并访问修改父类的私有属性
		
		s.setAge(10);    //子类继承类父类的set,get方法，就可以修改和访问父类属性了。
		int retValue=s.getAge();
		System.out.println(retValue);
	}

}