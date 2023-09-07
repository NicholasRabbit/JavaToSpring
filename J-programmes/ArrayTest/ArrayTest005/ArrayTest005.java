public class ArrayTest005 {

    public static void main(String[] args){
	
	    arrayMethod();

	}

	public static void arrayMethod(){
	
		//1,基本数据类型拷贝
	    int[] array01={11,22,33,44};
		int[] array02=new int[10];
		
		System.arraycopy(array01, 0, array02, 2, 4);

		for(int k=0; k<array02.length; k++){
		
		    System.out.println("扩容后新数组:"+array02[k]);
		}

		//2,引用数据类型拷贝拷贝的是数据还是对象引用地址？答：数据
		String[] strArr = {"Tom","Jerry","Hans","Matt"};
		String[] strArr2 = new String[10];
		System.arraycopy(strArr,0,strArr2,0,strArr.length);
		//改变源数组其中一个元素值,下面新数组的对应下标值不改变。
		strArr[0] = "Cherry";
		for(int i = 0; i < strArr.length; i++){
			System.out.println("strArr==>" + strArr[i]);
		}
		for(int i = 0; i < strArr2.length; i++){
			System.out.println("strArr2==>" + strArr2[i]);
		}


		//3,数组内存储的是对象，那么复制后的新数组保存的是对象还是对象的地址（引用）？答：
		User u1 = new User("Jack");
		User u2 = new User("Tom");
		User[] userArray = {u1,u2};
		User[] userArray2 = new User[4];
		System.arraycopy(userArray,0,userArray2,0,1);
		//源数组改了属性值，新数组也会改。说明复制的是对象的地址。
		u1.name = "Lily";
		for(int i = 0; i < userArray2.length; i++){
			System.out.println("userArray2==>" + userArray2[i]);
		}


	
	}

}


class User{

	String name;

	public User(){
	
	}

	public User(String name){
		this.name = name;
	}

	public String toString(){
		return "{" + name + "}";
	}
}
