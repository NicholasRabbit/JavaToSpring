public class EnumTest001 {

    public static void main(String[] args){     
	
	     Season retValue=method(6);
		 System.out.println(retValue);   
	
	}

	public static Season method (int i){
	
	    switch(i){
		
		    case 1: case 2: case 3:
				return Season.SPRING;
			case 4: case 5: case 6:
				return Season.SUMMER;
			case 7: case 8: case 9:
				return Season.AUTUMN;
			case 10: case 11: case 12:
				return Season.WINTER;
			default:
				return Season.NOTHING;
		}
	}  

}

 //ö�ٵ�ʹ�ã���ѡ������������������޷�ʹ��ʱ����enumö�����ͣ������оٶ�öѡ�
 //enum����������������
enum Season{                          

   SPRING,SUMMER,AUTUMN,WINTER,NOTHING
}