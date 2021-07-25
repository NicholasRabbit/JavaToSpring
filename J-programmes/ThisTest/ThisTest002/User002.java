public class User002{
    
	private int age;

/*
	public void setAge(int a){    //此处语法正确，是用a变量赋值给age,不涉及到this
	    age=a;
	}
	public int getAge(){
	
	    return age;
	}
*/

    public void setAge(int age){   //等号后边和int后的age是局部变量，this.age是实例变量
	    this.age=age;              //因此this的作用就是表示其后的age是实例变量。
	}                              //局部变量用age是为了见名知义
	public int getAge(){
	    return age;
	
	}

}