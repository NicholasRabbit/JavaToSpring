public class EqualsReview002 {

    public static void main(String[] args){
	
	    Student stu1=new Student(023,"小明");
		Student stu2=new Student(024,"小刚");
		Student stu3=new Student(023,"小明");

		boolean b1=stu1.equals(stu2);
		boolean b2=stu1.equals(stu3);
		System.out.println("b1:"+b1+'\n'+"b2: "+b2);

	}

	
}

class Student {

    private int id;
	private String name;

	public Student(){
	
	}
	public Student(int id, String name){
	    this.id=id;
		this.name=name;
	}

	public boolean equals(Object obj){
	   
	    if(obj==null || !(obj instanceof Student)){
		    return false;
		}
		
		Student stu=(Student)obj;

		boolean b=this.id==stu.id&&this.name.equals(stu.name);

		return b;
	}

}