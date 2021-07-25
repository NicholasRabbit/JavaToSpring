public class ObjectTest001 {

    public static void main(String[] args){
	
	    String[] str={"a","b","c","d"};

		method(str);

		method("tom","jerry","cat and mouse");   //如果参数有多个，调用有不定参数的方法，则自动添加到数组当中

		method("a","x");   //含有不定参数的方法，参数列表内参数数量可变

        //method(1);
        Integer itg01=new Integer(100);
        Integer itg02=new Integer(200);
        Integer itg03=new Integer(300);
		method(100,false,itg01,itg02,itg03);  //调用可变长度参数方法，这里也用到了method（）方法重载
	
	}
											      //可变长度参数只能有一个
	public static void method(String... str){    //类似于一个可自动扩展的一维数组。但参数列表内数量可变  注意此处是String...则只能传String类型的实参
	                                             //如果传多种类型，则可使用:method (Object... obj)
	    for(int i=0; i<str.length; i++){       
		    System.out.println(str[i]);  
		}
	}

	public static void method(int i, boolean b, Object... objs){  //如果形式参数列表里有其他参数，则不定参数放到最后，也是有且只有一个
	    System.out.println("i+b:"+i+"+"+b);
		for(Object obj : objs){
		System.out.println(obj);
		}
	}



}