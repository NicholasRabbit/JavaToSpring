

//Customer同时重写equals()和hashCode()方法
public class Customer {
    private int id;
    private String name;
    private int score;

    public Customer(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Customer() {
    }

    //idea自动重写的equals()和hashCode()，仅供参考
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    */

    //个人手动重写
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && name.equals(customer.name);
    }

    //仿照Java底层代码，重写hashCode()方法
    /*
    * 1. 为什么hashCode乘积系数为31?
    * (1)更少的乘积结果冲突，即不同属性值计算的hash值重复的概率小。
    * (2)31是个不大不小的质数, 能保证乘积有足够的离散率, 并且保证最后的hashCode不至于过大超出int范围
    * 计算可被JVM优化
    * 任意数n*31 = n*32 - n
    *           = n*2^5 - n ,
    * 这个式子可以转化成二进制运算：(0b)n << 5 - (0b)n,效率较高，注意这里n先转换成二进制，因为<<运算只针对二进制。
    * 2. 计算hashCode值实际就是把需要比较的属性的每个hash值累加起来。如果属性是对象则继续递归累加。
    * */
    @Override
    public int hashCode() {
        //这里为什么用31？参考：https://blog.csdn.net/weixin_44015626/article/details/107120469
        final int prime = 31;
        //result初始化
        int result = 1;
        //基本数据类型的hashCode值根据其包装类中重写的hashCode()方法可知等于它本身
        result = prime * result + id;
        /*
        * 计算出String类型属性的hashCode，String底层重写了hashCode(),
        * 其原理是把String拆成char[]，再每个char元素对应的值和31进行运算，实际char就是int，最后把结果累加起来。
        * */
        int nameHash = ((name == null) ? 0 : name.hashCode());
        result = prime * result + nameHash;
        return result;
    }
}




