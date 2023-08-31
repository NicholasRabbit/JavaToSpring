

/*
 * Enum的自带方法测试
 *
 * */

public class EnumValueAndOridnalsTest{

	public static void main(String[] args){
	
		//枚举中的属性自带toString()方法，不写也可以
		System.out.println("MonthEnum's toString:" + MonthEnum.JANUARY.toString());
		System.out.println("MonthEnum's toString:" + MonthEnum.JANUARY);




		//注意遍历时，类型就是MonthEnum这个枚举类
	 	for(MonthEnum me : MonthEnum.values()){
			
			System.out.println(me + ",ordinal:" + me.ordinal());
		
		}
	}

}
