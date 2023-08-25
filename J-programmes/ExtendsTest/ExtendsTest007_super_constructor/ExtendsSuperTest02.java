

/**
 * 多层继承的super调用范例
 * 还是从最低的子类一层一层向上用super()去掉父类的构造方法，有参或者无参，根据实际情况来订
 * */
public class ExtendsSuperTest02 {

    public static void main(String[] args) {
        new Cow();
    }

}


class Animal {
    public Animal() {
        System.out.println("Animal");
    }
}

class Livestock extends Animal {
    String type;
    public Livestock(String type) {
        //super();  //这里有个默认的super()去掉Livestock的父类Animal的无参构造。
        System.out.println(type);
    }
}

class Cow extends Livestock {

    public Cow(){
        super("cow");  //这里会调其父类Livestock的有参构造。
        new Livestock("cow");
    }


}


