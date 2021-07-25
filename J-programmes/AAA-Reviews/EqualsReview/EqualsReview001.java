public class EqualsReview001 {

    public static void main(String[] args){
	
	    String s1=new String("Tom");
        String s2=new String("Jerry");
		String s3=new String("Tom");

		boolean b0=s1==s3;           //双等号比较引用时，比较的是其地址，而不是引用所指向的内容。
		System.out.println(b0);
		
		boolean b1=s1.equals(s2);    //比较引用数据类型要用equals方法，String类里重写了String方法。
		System.out.println(b1);

		boolean b2=s1.equals(s3);
		System.out.println(b2);
		
		System.out.println("~~~~~~~~~");

		Student st1 = new Student (5563, "布雷迪");
		Student st2 = new Student (5566, "布利斯");
		Student st3 = new Student (5563, "布雷迪");
		boolean b3 = st1.equals(st2);
		System.out.println(b3);
		boolean b4 = st1.equals(st3);
		System.out.println(b4);

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

	public boolean equals (Object obj){
	
	    if(this==obj) {
			return true;
		}
		
		Student stu = (Student)obj;  //obj属于Object，需要向下转型

		if(obj==null || !(obj instanceof Student) || this.id != stu.id ){
		    return false;
		}else if(this.name.equals(stu.name) & this.id==stu.id){
		    return true;
		}
		return false;

	}

}