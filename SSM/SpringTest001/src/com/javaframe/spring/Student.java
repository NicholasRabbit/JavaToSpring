package com.javaframe.spring;

public class Student {

	private int num;      //这里最好写成包装类Integer，避免num不赋值时被当作0，默认值为0时容易计算出错，最好是Integer的默认值null
	private String name;
	private Integer age;
	private Double score;
	private Teacher teacher;
	
	
	
	public Student() {
	
	}

	//第一个有参构造
	public Student(int num, String name,Integer age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}

	//第二个有参构造
	public Student(int num, String name,  Double score) {   //有参构造重载

		this.num = num;
		this.name = name;
		this.score = score;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void setScore(Double score) {
		this.score=score;
	}
	public Double getScore() {
		return this.score;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher=teacher;		
	}
	public Teacher getTeacher() {
		return this.teacher;
	}
	@Override
	  public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", teacher=" + teacher +
                '}';
    }
	
	
	
	
	

}