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

		 ���಻�ܼ̳и����˽�����ԣ�������������й��еķ���Ӱ�쵽�˸���˽�����ԣ�
		 ��ô˽���������ܹ�������ʹ�õ�


*/

         AccountB jerry=new AccountB();
		          jerry.setIdNo(14000);
		 System.out.println(jerry.getIdNo());

		          jerry.setPhoneNo(15166001189L);
		 System.out.println(jerry.getPhoneNo());

		          jerry.setName("Jerry");
				  String k=jerry.getName();      //�����Ƚ����·���ֵ���ٴ�ӡ�����
         System.out.println(k);




	}
}