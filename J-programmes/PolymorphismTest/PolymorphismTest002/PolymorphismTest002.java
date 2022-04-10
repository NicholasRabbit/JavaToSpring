public class PolymorphismTest002{

    public static void main(String[] args){
	
	     Master m=new Master();
		 Cat tom=new Cat();       //这里也可写作Pet tom=new Cat(),即子类型向父类型转换，可以自动转换
		     m.feed(tom);


         Dog jack=new Dog();
		     m.feed(jack);

	}
}