public class ArrayTest005 {

    public static void main(String[] args){
	
	    arrayMethod();

	}

	public static void arrayMethod(){
	
		//1,�����������Ϳ���
	    int[] array01={11,22,33,44};
		int[] array02=new int[10];
		
		System.arraycopy(array01, 0, array02, 2, 4);

		for(int k=0; k<array02.length; k++){
		
		    System.out.println("���ݺ�������:"+array02[k]);
		}

		//2,�����������Ϳ��������������ݻ��Ƕ������õ�ַ��������
		String[] strArr = {"Tom","Jerry","Hans","Matt"};
		String[] strArr2 = new String[10];
		System.arraycopy(strArr,0,strArr2,0,strArr.length);
		//�ı�Դ��������һ��Ԫ��ֵ,����������Ķ�Ӧ�±�ֵ���ı䡣
		strArr[0] = "Cherry";
		for(int i = 0; i < strArr.length; i++){
			System.out.println("strArr==>" + strArr[i]);
		}
		for(int i = 0; i < strArr2.length; i++){
			System.out.println("strArr2==>" + strArr2[i]);
		}


		//3,�����ڴ洢���Ƕ�����ô���ƺ�������鱣����Ƕ����Ƕ���ĵ�ַ�����ã�����
		User u1 = new User("Jack");
		User u2 = new User("Tom");
		User[] userArray = {u1,u2};
		User[] userArray2 = new User[4];
		System.arraycopy(userArray,0,userArray2,0,1);
		//Դ�����������ֵ��������Ҳ��ġ�˵�����Ƶ��Ƕ���ĵ�ַ��
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
