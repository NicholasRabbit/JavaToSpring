public class Customer extends PersonTemplate {

	public void m3(){
		System.out.println("顾客离开");   //m3写这里也是最后执行，因为模板已经规定好顺序
	}
	
	
	
	public void m1(){
		System.out.println("顾客进门");	
	}
	public void m2(){
		System.out.println("顾客消费");
	}
	
}