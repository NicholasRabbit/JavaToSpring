public class ArrayTest009 {

	public static void main(String[] args){
		//1，一维数组声明的第三种方式，静态初始化。
		int[] arr01=new int[]{1,2,3,4,5};
		System.out.println("数组长度==>"+arr01.length);	
		for(int i=0;i<arr01.length;i++){
			System.out.println(arr01[i]);
		}

		//2，也可以使用对象
		User u1=new User(1001,"Tom");
		User u2=new User(1002,"Jerry");
		User u3=new User(1003,"Lena");
		User[] users=new User[]{u1,u2,u3};
		System.out.println("users length==>"+users.length);
		for(int i=0;i<users.length;i++){
			System.out.println(users[i]);
		}

		//3，一个数组类型变量赋值后，不能再赋值别的数组了，会报错，但用new int[]{}可以
		int[] array = {1,2,3};  
		array = {4,5,6};  //本句报错，因为编译器无法知道大括号内的数据类型
		array = new int[]{4,5,6};  //这句不报错。因为new int[]起到了初始化的作用，编译器知道是int类型。

	
	}
}

class User {
	int id;
	String name;

	public User(){
	
	}
	public User(int id,String name){
		this.id=id;
		this.name=name;
	}

	public String toString(){
		return  "User {"+this.id+","+this.name+"}";
	}
}