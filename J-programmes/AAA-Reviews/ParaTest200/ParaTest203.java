public class ParaTest203 {

    public static void main(String[] args){
	
	     User u=new User(30);
		      add(u);
		 
		 int k=u.age;
		 System.out.println("main����:"+u.age);
		      
	}
	public static void add(User u){
	     u.age++;
		 System.out.println("add����:"+u.age);
	     
	}

}

class User {
    int age;
	public User(int m){
	
	     age=m;
	}
}