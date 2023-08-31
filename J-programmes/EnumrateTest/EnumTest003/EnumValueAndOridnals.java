public class EnumValueAndOridnals{

	public static void main(String[] args){
	
	 	for(MonthEnum me : MonthEnum.values()){
			
			System.out.println(me + ":" + me.ordinal());
		
		}
	}

}
