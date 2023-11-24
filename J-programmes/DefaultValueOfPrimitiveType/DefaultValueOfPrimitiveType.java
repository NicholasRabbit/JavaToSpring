public class DefaultValueOfPrimitiveType{

	public static void main(String[] args){
		
		Foo f = new Foo();
		f.printDefault();
		
	}
}

class Foo{
	byte b;
	short s;
	int i;
	long l;

	float f;
	double d;
	boolean n;
	char c;

	public void printDefault(){
		System.out.println("byte:" + b);
		System.out.println("char:" + c);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}


}
