public class HashCodeTest001 {

    public static void main(String[] args){
	    
        method();

	}
    public static int method(){
	    
		Object o=new Object();
		int hashCodeValue1=o.hashCode();
		System.out.println(hashCodeValue1);   //�����ϣֵ��366712642����������ڴ��ַͨ��ת����Ϊһ������ֵ

		User u=new User();
		int hashCodeValue2=u.hashCode();
		System.out.println(hashCodeValue2);  //�����ϣֵ��1829164700
		return hashCodeValue2;
	
	}
}

class User {

    int age;

}