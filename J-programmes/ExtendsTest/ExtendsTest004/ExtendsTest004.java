public class ExtendsTest004 {

    public static void main(String[] args){
	
/*
���಻�ܼ̳и����˽�����ԣ�������������й��еķ���Ӱ�쵽�˸���˽�����ԣ�
��ô˽���������ܹ�������ʹ�õ�
*/
		
		
		Son s=new Son();
		//s.age=10;      //���뱨������ͨ������ֱ�Ӽ̳�,�������޸ĸ����˽������
		
		s.setAge(10);    //����̳��ุ���set,get�������Ϳ����޸ĺͷ��ʸ��������ˡ�
		int retValue=s.getAge();
		System.out.println(retValue);
	}

}