package com.springframe.test01;

public class Student {
	private Integer id;
	private String name;
	private Double  score;
	private Float weight;
	private Teacher t;
	
	public Teacher getT() {
		return t;
	}
	public void setT(Teacher t) {
		this.t = t;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Integer id, String name, Double score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	
	public Student(Integer id, String name, Float weight) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
	}
	
	
	public Student(Integer id, String name, Double score, Float weight, Teacher t) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.weight = weight;
		this.t = t;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + ", weight=" + weight + ", t=" + t + "]";
	}

	
	
	
}
