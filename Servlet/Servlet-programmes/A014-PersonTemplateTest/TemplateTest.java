public class TemplateTest {

	public static void main(String[] args){
		
		PersonTemplate user=new User();
		user.templateMethod();   //子类执行m1,2,3的顺序严格按照模板父类里写好的顺序

		PersonTemplate customer=new Customer();
		customer.templateMethod();
	}
}