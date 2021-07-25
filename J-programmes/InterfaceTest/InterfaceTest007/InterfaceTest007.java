public class InterfaceTest007 {

    public static void main(String[] args){
	
	    //这个接口Bicycle把Customer和Honda Yamaha（具体对象）解耦合了，这就是面向抽象（Bicycle）编程。
        //这样Customer只和Bicycle有联系，Honda,Yamaha也只和Bicycle有联系。
		Bicycle h=new Honda();
		Customer c1=new Customer(h);    //重点是Customer类里，把h所含内存地址传进去。传给bikeMake。
		c1.purchase();

		Bicycle y=new Yamaha();
		Customer c2=new Customer(y);
		c2.purchase();

		Customer c3=new Customer();
		Bicycle y2=new Yamaha();
		c3.setBikeMake(y2);         //也可以用set方法来设置参数。
		c3.purchase();

	} 

}