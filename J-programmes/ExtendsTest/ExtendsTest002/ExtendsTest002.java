public class ExtendsTest002 {

    public static void main(String[] args){
	
/*
		 AccountA  tom=new AccountA();
		           tom.setIdNo(13000);
         System.out.println(tom.getIdNo());

		           tom.setPhoneNo(18920113456L);
         System.out.println(tom.getPhoneNo());
		           
				   tom.setName("Tom");
         System.out.println(tom.getName());

		 子类不能继承父类的私有属性，但是如果子类中公有的方法影响到了父类私有属性，
		 那么私有属性是能够被子类使用的


*/

         AccountB jerry=new AccountB();
		          jerry.setIdNo(14000);
		 System.out.println(jerry.getIdNo());

		          jerry.setPhoneNo(15166001189L);
		 System.out.println(jerry.getPhoneNo());

		          jerry.setName("Jerry");
				  String k=jerry.getName();      //可以先接收下返回值，再打印输出。
         System.out.println(k);




	}
}