public class OverrideTest001 {

    public static void main(String[] args){
	
	     Athlete player=new Athlete();
		         player.sports();

		 Swimmer s=new Swimmer();    //�������ǣ���Swimmer��Runner�ﶼ�̳���Athlete�ķ������������˸���
		         s.sports();        

		 Runner r=new Runner();
		        r.sports();
	}
}