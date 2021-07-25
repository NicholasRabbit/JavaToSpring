public class ExtendsTest005 {

    public static void main(String[] args){
	    
	    Animal r=new Rabbit();
	    //r.name="兔子";           //多态语法下，引用r虽然内存地址指向Rabbit对象，但访问子类Rabbit特有属性时，仍需向下转型。
		Rabbit rabbit=(Rabbit)r;
		rabbit.name="兔子";
		System.out.println(rabbit.name);

		r.weight=10;              //继承来的属性，则不用转换
		System.out.println(r.weight);
	}

}

class Animal {
    int weight;

}

class Rabbit extends Animal {
    //int weight;   //继承属性，可不写
	String name;

}