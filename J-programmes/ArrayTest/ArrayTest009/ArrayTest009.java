public class ArrayTest009 {

	public static void main(String[] args){
		//一维数组声明的第三种方式
		int[] arr01=new int[]{1,2,3,4,5};
		System.out.println("数组长度==>"+arr01.length);	
		for(int i=0;i<arr01.length;i++){
			System.out.println(arr01[i]);
		}

		//也可以使用对象
		User u1=new User(1001,"Tom");
		User u2=new User(1002,"Jerry");
		User u3=new User(1003,"Lena");
		User[] users=new User[]{u1,u2,u3};
		System.out.println("users length==>"+users.length);
		for(int i=0;i<users.length;i++){
			System.out.println(users[i]);
		}
	
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