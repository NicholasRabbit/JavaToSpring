public class ArmyTest {

    public static void main(String[] args){
	
	    Army a=new Army(5);

		Weapon wa=new Pistol("手枪");  //多态语法 
		
		System.out.println(wa.name);  //此处输出父类中的值：武器，虽然上面是多多态语法，生成对象wa(内存地址指向Pistol对象)，
		                              //但是Weapon类进行了实例化，子类Pistol继承了父类属性name的值，因此wa.name为："武器"，即使上面子类Pistol实例化赋值：“手枪”也不会调用。
		System.out.println(wa);       //重点是子类Pistol继承了父类Weapon的值，即使父类的值为空，也继承。

		a.addWeapon(wa);

		wa.attack();
	}

}