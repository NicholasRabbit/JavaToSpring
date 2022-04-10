public class EqualsTest004 {

    public static void main(String[] args){
	
	    Student s1=new Student(2300,"大名一中");
		Student s2=new Student(2300,"大名一中");
        boolean b=s1.equals(s2);   //判断这个学生是不是同一个人。
        System.out.println(b);     //结果为true。
	}

}

class Student {

    private int no;
	private String name;     //学校名称

	public Student(){
	
	}
	public Student(int no, String name){
	    this.no=no;
		this.name=name;
		System.out.println(no+name);
	
	}

	public boolean equals(Object obj){
	     
		 if(obj==null|!(obj instanceof Student)){
		     return false;
		 }

		 if(this==obj)  return true;  //if后只有一个大括号，可省略不写。

		 Student stu=(Student)obj;           //obj属于Object类的引用，调用子类里特有的实例变量的时候，需要向下转型，否则报错。

		 if(this.name.equals(stu.name)){     //因为引用数据类型变量里name不含有具体数据，而是一个内存地址，指向java在堆内存里自动创建的String类对象。  
		                                     //这里需要进一步调用String类型s1,s2里name的equals()重写后的方法,来比较它们内含的字符串,不能写s1.equals(s2)。
		     return true;                   
		 }

		 return false;
		 
	    
	
	}



}