

public class CastingTest {

    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base)b3;   //强制向上转型，实际不写默认自动转，不省略的话写上也可以，不报错

        Base b4 = (DerivedA) new DerivedB();

        b1.test();
        b4.test();

		//重点注意：
		//这里编译不报错，但是运行时报错，因为不确定DeriveA对象一定是DeriveB或其子类，
		//有可能是DeriveA的其它子类DerivedC
        DerivedB b5 = (DerivedB) new DerivedA();  
        b5.testB();
    }

}

class Base{
    public void test(){
        System.out.println("Base ");
    }
}

class DerivedA extends Base {
    @Override
    public void test() {
        System.out.println("Derived A");
    }
}

class DerivedB extends DerivedA {
    @Override
    public void test() {
        System.out.println("Derived B");
    }

    public void testB(){
        System.out.println("Derived B testB");
    }
}

class DeriveC extends DerivedA{
	
}
