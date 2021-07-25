public class ConTest02{

    public static void main(String[] args){
	    
		ConTest02.method02();

		ConTest02 c=new ConTest02();
		//用"引用.方法"的格式也可以调用含static的方法
		//即使这个c=null，地址为空，不会出现空指针异常报警。因为没有通过对象去调用static方法，这里c实质上和类名等效了
				  c=null;             
				  c.method02();       

	
	
	}
	public static void method02(){
	    
	    System.out.println("methdo01方法调用成功。");
	}
}