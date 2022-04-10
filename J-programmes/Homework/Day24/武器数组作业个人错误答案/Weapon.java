public class Weapon {

    boolean mobility;   //武器机动性
	String name="武器";

	public Weapon (){
	
	}
	public Weapon (String name) {
	    this.name=name;
	}
	
	
	public boolean move (boolean mobility){
	    this.mobility = mobility;
		return mobility;
	}

    public void attack () {
	    System.out.println(this.name+"W在攻击");
	}

	
}