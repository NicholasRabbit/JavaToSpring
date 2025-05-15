public class PassByValueTest {

	public static void main(String[] args) {
		User u = new User();
		u.id = 10;
		System.out.println("u.id:" + u.id);
		doSome(u);

		System.out.println("After calling method, u.id:" + u.id);
		
	}

	/*
	 * Java is pass by value.
	 * In Java, the arguments of a called method are temporary variables to which
	 * the caller copy value. Assigning new value to the arguments doesn't change the
	 * value of the orginal variables in the caller.
	 * The property of Java differenciates it from C; a function in C with pointers as 
	 * its parameters have access to the value in its caller by assigning new value to 
	 * the pointer.
	 * */
	public static void doSome(User u) {
		u = new User();	
		u.id = 25;
	}

}



class User {
	int id;
}
