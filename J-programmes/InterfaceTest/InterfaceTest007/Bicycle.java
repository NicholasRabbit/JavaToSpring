public interface Bicycle {    //这个接口把Customer和Honda Yamaha（具体对象）解耦合了，这就是面向抽象（Bicycle）编程。
                              //这样Customer只和Bicycle有联系，Honda,Yamaha也只和Bicycle有联系。
    public abstract String make();




}