package com.javaframe.spring;

public class Teacher {
    private int age;         //建议使用Integer包装类替代基本数据类型，防止出现默认值为0的情况，造成误解
    private String subject;  //教授科目
    private String tname;

    public Teacher() {
    }

    public Teacher(int age, String subject, String tname) {
        this.age = age;
        this.subject = subject;
        this.tname = tname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", subject='" + subject + '\'' +
                ", tname='" + tname + '\'' +
                '}';
    }
}
