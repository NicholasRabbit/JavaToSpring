package com.test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamListTest {

    public static void main(String[] args) {
        String[] arr1 = {"A","B","C","D"};
        String[] arr2 = {"C","D","E","F"};
        List<String> list = Arrays.asList(arr1);
        List<String> list1 = Arrays.asList(arr2);
        List<String> collect = Stream.concat(list.stream(), list1.stream()).distinct().collect(Collectors.toList());
        System.out.println(collect);


        //求和
        List<User> userList = new ArrayList<>();
        userList.add(new User(1L,"Tom",65));
        userList.add(new User(2L,"Jerry",77));
        userList.add(new User(3L,"Ken",83));

        int sum = userList.stream().mapToInt(User::getGrade).sum();
        System.out.println("sum==>" + sum);

    }
}

class User {
    private Long id;
    private String name;
    private Integer grade;

    public User() {

    }

    public User(Long id, String name, Integer grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
