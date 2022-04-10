public class MyIntTest003 {

    public static void main(String[] args){
	
	      int a=100;                       //此例个人手动创建一个包装类MyInt，有助理解java自带包装类的用途
                                           //int类的a=100,无法传进doSome(Object obj)方法里，形式参数不同，因此创建一个MyInt类来包装起来
		  MyInt mi=new MyInt(100);         //MyInt类里重写了toString()方法，是的100转换为String类型，即包装起来了。

		  doSome(mi);

	}

	public static void doSome(Object obj){  //此处用Object做引用数据类型，Object是所有类的父类，涉及到多态，即Object obj=new MyInt(100);
	
	     System.out.println(obj);
	}

}

class MyInt {

    private int value;

	public MyInt (int value){
	 
	    this.value=value;
	}

	public String toString(){
	
	    return String.valueOf(value);
	}

}