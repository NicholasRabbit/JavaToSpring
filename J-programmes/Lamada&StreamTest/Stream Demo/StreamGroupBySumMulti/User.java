package com.test.stream.sum;

public class User {

    private int age;
    private String province;
    private int salary;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", province='" + province + '\'' +
                ", salary=" + salary +
                '}';
    }

    public User(int age, String province, int salary) {
        this.age = age;
        this.province = province;
        this.salary = salary;
    }

    public User() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
