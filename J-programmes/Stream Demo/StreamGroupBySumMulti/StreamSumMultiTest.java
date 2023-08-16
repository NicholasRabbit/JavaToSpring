package com.test.stream.sum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream分组后，给多个属性求和范例
 * */
public class StreamSumMultiTest {

    public static void main(String[] args) {
       sum();
    }

    private static void sum() {
        List<User>  userList = new ArrayList<>();
        userList.add(new User(20,"河北",2400));
        userList.add(new User(25,"河北",3000));
        userList.add(new User(39,"河南",5500));
        userList.add(new User(43,"河南",7000));
        userList.add(new User(52,"北京",6000));
        userList.add(new User(69,"北京",2400));
        userList.add(new User(72,"天津",2400));

        List<User> users = userList.stream().collect(Collectors.groupingBy(User::getProvince))
                .entrySet() //这里得到的结果是Set<Map.Entry<String,List<User>>>
                .stream()
                .map(entry -> {  //这里再对Set进行遍历
                    //获取key，即分类关键词 省份
                    String province = entry.getKey();
                    //entry.getValue的值就是分好类的List<User>
                    int totalAge = entry.getValue().stream().mapToInt(User::getAge).sum();  //把一个组的年龄求和
                    int totalSal = entry.getValue().stream().mapToInt(User::getSalary).sum();   //薪水求和
                    //构造新的对象返回
                    return new User(totalAge, province, totalSal);
                }).collect(Collectors.toList());
        System.out.println(users);
    }

}
