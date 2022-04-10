public class ArmyTest {

    public static void main(String[] args){
	
	    Army a=new Army(5);

		Weapon wa=new Pistol("手枪");  //多态语法 
		
		System.out.println(wa.name);  //此处输出父类中的值：武器，多态语法中，子类Pistol又重新声明了name这个变量，
		                              //而wa属于Weapon类变量，虽然实际内存地址指向子类，但是在编译阶段属性是静态绑定的，即wa.name是调用的父类里的name
									  //如果子类Pistol里不重新声明的话，则不会出现这种静态绑定。
									
		System.out.println(wa);       //重点是子类Pistol继承了父类Weapon的值，即使父类的值为空，也继承。

		a.addWeapon(wa);

		wa.attack();
	}

}

/*
Person父类，Son子类，在子类中重新声明变量name的情况下
变量是静态态绑定，方法是动态绑定。
静态绑定就是变量本身什么类型，就用哪个里面的。
例如，你的p.name的p是Person类型，那么name就是Person类中的name。
而如果是动态绑定，那么会从本身类型开始向超类型查找。
如果name是方法，那么用于p是Son类的一个对象，所以会从Son开始找name方法，如果找不到再到父类中找。

*/