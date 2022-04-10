public abstract class AbstractTest002 {

    public AbstractTest002(){               //抽象类里可以有构造方法，因为子类里有默认的无参数构造方法，其默认内含super(),
	                                        //调用父类的无参数构造方法。
	}

	public AbstractTest002(int num){        //抽象类里也可以有有参构造方法
	
	
	}

	public void mdthod01(){
	
	}
	
	public abstract void method02();       //抽象类里可以有抽象方法，抽象方法不执行，无方法体，即无大括号。
                                           //抽象类里不一定有抽象方法，但是抽象方法一定出现在抽象类里，
                                           //因此有子类继承抽象类,子类同时也继承了抽象方法，子类必须是抽象类，否则编译报错。


   // private abstract void method03();    //abstract和private也不可连用。
}


abstract class User01 extends AbstractTest002 {

    public User01(){
	    super();
	}

}



/*
abstract final class User02 {   //abstract和final不可连用。

}
*/

/*
class User03 extends AbstractTest002 {}     //如果抽象类里有抽象方法，那么一般类不能继承抽象类，如果继承那就继承了抽象方法,
                                            //抽象方法不能出现在一般类里
*/