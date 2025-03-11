package p2;

import p1.Acc;


public class ProtectedTest extends Acc {
	
	public static void main(String[] args){
		/*
		 * Since `Acc` is in the package of "p1" and Test is in "p2", 
		 * members like "int r" with the implicit modifier of package-private 
		 * could be accessed if and only if the subclass is declared without 
		 * polymorphism as in Example 1. 
		 * When compiled, `obj` is an instance of ACC. Conventionally, members with `protected` 
		 * can only be accessed within its package (like *package-private*) and, 
		 * in addition, by a subclass of its class in another package such as in "Example 1" below. 
		 * */
		// Example 1
		ProtectedTest test = new ProtectedTest();
		int t1 = test.p;
		int t2 = test.q;
		int t3 = test.r;  // protected
		int t4 = test.s;

		// Example 2
		Acc obj = new ProtectedTest();
		int p = obj.p;
		int q = obj.q;
		int r = obj.r;  // protected
		int s = obj.s;



	}

}
