public class Weapon {

    boolean mobility;   //����������
	String name="����";

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
	    System.out.println(this.name+"W�ڹ���");
	}

	
}