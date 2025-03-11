package p2;

import p1.Acc;


public class ProtectedTest extends Acc {
	
	public static void main(String[] args){
		/*
		 * Since Acc is in the pacakge of "p1" and ProtectedTest is in "p2", 
		 * memebers like "int r" with the implicit modifier of package-private could be accessed if and 
		 * only if the subclass is declared without polymorphism as in Example 1.
		 * N.B. The "int r" can not be accessed if the instace variable is the super class.
		 * */
		// Example 1
		ProtectedTest test = new ProtectedTest();
		int t1 = test.p;
		int t2 = test.q;
		int t3 = test.r;  // implicit modifier of package-private
		int t4 = test.s;

		// Example 2
		Acc obj = new ProtectedTest();
		int p = obj.p;
		int q = obj.q;
		int r = obj.r;  // implicit modifier of package-private
		int s = obj.s;



	}

}
