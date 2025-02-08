public class Son extends Father {

	String name="Son";

	public void work(){
		System.out.println("A son is working.");
	}

	public void methodOfSon(){
		//this.name is the field in this class, namely the Son.class.
		System.out.println(this.name);   
		//To call the "work()" method in Son.
		this.work();                     

		System.out.println("~~~~~~~~~~~~~~~");

		//While super is used to get the field in Son's or to call
		//the method in super class even though there are ones with
		//same names in Son.class.
		System.out.println(super.name);   
		super.work();                     


	}

}
