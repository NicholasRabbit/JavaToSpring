public class AccountB extends AccountA {

    /*
	private int idNo;        //这里的三个属性跟AccountA里一样，不写也行，不报错  
	private long phoneNo;
	private String name; 
	*/


	/*
	子类不能继承父类的私有属性，但是如果子类中公有的方法影响到了父类私有属性，
    那么私有属性是能够被子类使用的

	这里继承了父类的set，get方法，并且使用到了私有的属性，因此可继承使用。
    */
}