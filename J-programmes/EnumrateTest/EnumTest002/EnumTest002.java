public class EnumTest002 {

    public static void main(String[] args){     //调用public enum Colours类里面的参数，可直接打印输出，此处enum与public class 的class类似。也需要文件名与类名一致。
	
	    Colours c=traffic("红灯");
		System.out.println(c);
	}

    public static Colours traffic(String light){   //当一个方法执行完有多个结果，布尔类型不够用时，可以用enum枚举，把返回值类型设定为enum类型的。本例Colours
	
	    if("绿灯".equals(light)){                  //字符串String用String类里的equals()方法比较是否相等。
		    return Colours.GREEN;                  //此处用："绿灯".equals(light)而不是：light.equals("绿灯")，是为了避免可能发生变量light空指针异常
		}else if("红灯".equals(light)){
		    return Colours.RED;
		}else if("黄灯".equals(light)){
		    return Colours.YELLOW;
		}
		return Colours.ERROR;
	
	} 

}