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

 //枚举的使用，当选项超过两个，布尔类型无法使用时，用enum枚举类型，可以列举多枚选项；
 //enum属于引用数据类型
enum Season{                          

   SPRING,SUMMER,AUTUMN,WINTER,NOTHING
}