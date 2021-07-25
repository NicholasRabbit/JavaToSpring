public class BoxTest001 {

    public static void main(String[] args){
	    
		                                //八种包装类属于引用数据类型，用来扩展基本数据类型的功能。
										//这里以Integer为例，其他byte,short等类似

	    Integer i=new Integer(123);    //装箱，即把基本数据类型的数据转换为引用数据类型
		System.out.println("Integer包装类里的i:"+i);
		

		String s="6300";               //也可以把String类型的引用数据类型包装进Integer类型里
		Integer i2=new Integer(s);
		System.out.println(s);
		

		
		int retValue=i.intValue();      //拆箱，把引用数据类型的数据转换为基本类型int，并返回
		System.out.println(retValue);   //123
		
		float retValue_f=i2.floatValue();  //拆箱，把引用数据类型的数据转换为基本类型float，并返回
		System.out.println(retValue_f);    //6300.0
        
		byte num=120;
		Byte b=new Byte(num);      //Byte包装类，对应byte，用法和Integer一样。
		System.out.println(b);     //此处num直接写120不行，编译报错，因为虽然120默认int类型，在byte类范围内，
		                           //可直接赋值，但是Byte类的构造方法形参列表不认可，因此报错。
        
		//MAX_VALUE和MIN_VALUE
		System.out.println(b.MAX_VALUE);  //Byte包装类里有byte类型的最大值常量属性，127，可直接调用。Integer包装类一样用法。
		System.out.println(b.MIN_VALUE);  //最小值-128


      
	
	
	}

}