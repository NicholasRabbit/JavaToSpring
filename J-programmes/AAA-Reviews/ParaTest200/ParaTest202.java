public class ParaTest202{
    public static void main(String[] args){
	     Man m=new Man(60);
        
			 test(m);
			 System.out.println("main����: "+m.age);
	
	}
	public static void test(Man m){
		m.age++;
		System.out.println("test������"+m.age);
	
	}

}

class Man{
    int age;
    public Man(int a){
	
	   age=a;
	}

}