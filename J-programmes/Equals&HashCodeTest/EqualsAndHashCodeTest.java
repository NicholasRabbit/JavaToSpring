

import java.util.*;

/*
* 研究为什么放到Set(HashSet),HashMap等中的对象必须重写equals(),hashCode()方法?
* 1,为什么重写equals()方法？
* (1)两个对象是靠equals()方法判断是否相等的，而默认继承自Object父类的是比较引用内存地址。
* (2)而HashMap的key实际就是HashSet，就是靠equals(..)判断是否相等，例：HashMap<User,Object>的key是用户自定义的User的话，User必须重写equals
* 常用的Map<String,Object>中String已重写equals(..)方法。
* 2,放到HashSet, HashMap中的对象为什么重写equals()之后必须重写 hashCode()方法？
* 因为Set判断对象是否相等是同时判断equals()和hashCode()是否相等，缺一个条件不可。同理HashMap的key(即也是HashSet)
*
* */
public class EqualsAndHashCodeTest {

    public static void main(String[] args) {



        /*
         * 一，不重写equals(..)和hashCode()方法
         * 这里的结果为false,set.size()的结果是2。
         * 而要求是只要id和name相同则判断为同一个用户，只是分数score可以修改。
         * user1和user2应该判断为同一个用户添加到Set中。
         * */
        User user1 = new User(1001, "Tom",60);
        User user2 = new User(1001, "Tom",70);

        System.out.println(user1.equals(user2));  //false
        Set<User> set = new HashSet<>();
        Map<User,Object> map = new HashMap<>();
        set.add(user1);
        set.add(user2);
        map.put(user1,user1);
        map.put(user2,user2);
        System.out.println("set size==>" + set.size());
        System.out.println("map size==>" + map.size());  //这里输出结果都是2。

        /*
        * 二，只重写equals()方法
        * Student重写equals(..)方法，没有重写hashCode，stu1和stu2的hashCode值不同。
		* 这里的equals(..)结果为true,但是size()的结果是2，说明Set内部还是判断它们为不同的对象。
        */
        Student stu1 = new Student(1001, "Tom", 30);
        Student stu2 = new Student(1001, "Tom", 40);
        Set<Student> stuSet = new HashSet<>();
        Map<Student,Object> stuMap = new HashMap<>();
        stuSet.add(stu1);
        stuSet.add(stu2);
        stuMap.put(stu1,stu1);
        stuMap.put(stu2,stu2);
        System.out.println("stu.equals()==>" + stu1.equals(stu2));  //true
        //没有重写hashCode方法，因此两个对象虽然id,name相同，equals()判断为true，但是下面的size都是2
        System.out.println("stu1 hashCode==>" + stu1.hashCode());
        System.out.println("stu2 hashCode==>" + stu2.hashCode());
       
        System.out.println("stuSet size==>" + stuSet.size() );
        System.out.println("stuMap size==>" + stuMap.size());    //以下输出结果都还是2。

        /*
        * 三，同时重写equals()和hashCode()方法。
        * 都重写后下面的size都是1了。说明只有equals()和hashCode()相同，Set才会认为是一个对象。
        * */
        Customer customer1 = new Customer(1002, "Jerry", 36);
        Customer customer2 = new Customer(1002, "Jerry", 66);
        
		System.out.println("customer equals==>" + customer1.equals(customer2));  //true
        System.out.println("customer1.hashCode()==>" + customer1.hashCode());
        System.out.println("customer2.hashCode()==>" + customer2.hashCode());
        
		Set<Customer> customerSet = new HashSet<>();
        Map<Customer,Object> customerMap = new HashMap<>();
        customerSet.add(customer1);
        customerSet.add(customer2);
        customerMap.put(customer1,customer1);
        customerMap.put(customer2,customer2);

        System.out.println("customerSet.size()==>" + customerSet.size());
        System.out.println("customerMap.size()==>" + customerMap.size());  //这里结果都是：1


    }
}





