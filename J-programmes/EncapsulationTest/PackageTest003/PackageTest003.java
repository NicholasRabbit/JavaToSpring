public class PackageTest003{
    
	public static void main(String[] args){
	
	    Student003 stu=new Student003();
		           
				   stu.setName("Charles Dickens");
				   System.out.println("姓名:"+stu.getName()); //直接在输出里调用时不要忘了小括号stu.genName()。

				   stu.setGender("二夷的");
				   System.out.println("性别: "+stu.getGender());

				   stu.setAge(25);
				   int k=stu.getAge();
				   System.out.println(k);
	
	}



}