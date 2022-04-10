public class ExtendsTest001 {

    public static void main(String[] args){
	
	    ExtendsTest001 et=new ExtendsTest001();
		
		String k=et.toString();   //java中每个没有继承的类里都是继承java自带的Object类，toString()是Obeject类里的一个方法。
		                          //此处验证通过，不报错
		System.out.println(k);    
	
	}
}