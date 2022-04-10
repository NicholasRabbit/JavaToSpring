public class Customer {

    private Bicycle bikeMake;  //摩托车型号。注意领会把一种类也当做一种数据类型的思想，并且和purchase()方法联系结合使用。

	public Customer(){
	
	}

	public Customer(Bicycle bikeMake){        //此处接收Test类里传进来的内存地址，以供下方purchase()方法使用，来调用各子类里的make()方法。
	
	    this.bikeMake=bikeMake;
	}
    
	//set&get方法。
    public void setBikeMake(Bicycle bikeMake){
	
	   this.bikeMake=bikeMake;
	}
	public Bicycle getBikeMake(){     //返回值类型也是Bicycle,因此retrun bikeMake;
	
	   return bikeMake;
	}

	public void purchase(){
	
	    bikeMake.make();      //this.bikeMake.make()省略形式，this.在此省略了。
	}

}