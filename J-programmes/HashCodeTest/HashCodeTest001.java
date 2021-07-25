public class HashCodeTest001 {

    public static void main(String[] args){
	    
        method();

	}
    public static int method(){
	    
		Object o=new Object();
		int hashCodeValue1=o.hashCode();
		System.out.println(hashCodeValue1);   //输出哈希值：366712642，即对象的内存地址通过转换成为一个整数值

		User u=new User();
		int hashCodeValue2=u.hashCode();
		System.out.println(hashCodeValue2);  //输出哈希值：1829164700
		return hashCodeValue2;
	
	}
}

class User {

    int age;

}