
public class Student {
	
	private int id;
	private String name;
	private double score;
	public Student(){
	
	}
	public Student(int id,String name,double score){
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public String toString(){
		return "{" + id + ":" + name + ":" + score + "}";
	}
}