public class OOTest001{
    

	public static void main(String[] args){
	    Student s=new Student();                 //此处声明Student类型变量，它是一个局部变量，在方法体内声明，不能在方法体外
		  
		/*
		int stuNum=s.number;                     //访问实例变量，读取数据，语法格式：引用.变量名，注意前面必须先声明变量s。

		byte stuAge=s.age;
		
		boolean stuGender=s.gender;

		String stuName=s.name;

		long stuHeight=s.height;

		
		System.out.println("stuNum  "+stuNum);
		System.out.println("stuAge  "+stuAge);
		System.out.println("stuGender  "+stuGender);
		System.out.println("stuName  "+stuName);
		System.out.println("stuHeight  "+stuHeight);
        */
		System.out.println("stuNum  "+s.number);      //上面程序可直接简化成这种写法，不用声明stuNum等变量，直接打印输出
		System.out.println("stuAge  "+s.age);
		System.out.println("stuGender  "+s.gender);
		System.out.println("stuName  "+s.name);
		System.out.println("stuHeight  "+s.height);

		System.out.println("分割线~~~~~~~~~~~~~~~~~~");

		Student m=new Student();                      //此处重新声明m变量，来进行引用，在堆内存中这是重新分配的另一块地方
                                                      //与上面s不是在堆内存里不是同一块地方
		
		m.number=10;                                  //修改数据语法格式                                
		int stuNum02=m.number;

		m.age=25;
		byte stuAge02=m.age;

		m.gender=true;
		boolean stuGender02=m.gender;

		m.name="Brady";
		String stuName02=m.name;

		m.height=170L;
		long stuHeight02=m.height;

		System.out.println("stuNum02  "+stuNum02);      //也可以写作，System.out.println("stuNum02  "+m.number);下面一样
		System.out.println("stuAge02  "+stuAge02);
		System.out.println("stuGender02  "+stuGender02);
		System.out.println("stuName02  "+stuName02);
		System.out.println("stuHeight02  "+stuHeight02);

		    

	
	}


}