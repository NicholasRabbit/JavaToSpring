public class OverrideTest001 {

    public static void main(String[] args){
	
	     Athlete player=new Athlete();
		         player.sports();

		 Swimmer s=new Swimmer();    //方法覆盖，在Swimmer和Runner里都继承了Athlete的方法，并进行了覆盖
		         s.sports();        

		 Runner r=new Runner();
		        r.sports();
	}
}