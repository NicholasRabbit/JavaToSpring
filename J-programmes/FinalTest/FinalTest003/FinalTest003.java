public class FinalTest003 {

    public static void main(String[] args){
	     
		  FinalTest003.test();

		  TestA m=new TestA();
		    System.out.println(m.score);
		        
	    
	}
	public static void test(){
	
	    final int a=20;
		          //a=30;   //���б���final���εı��������ٴ����¸�ֵ��

	}


}

class TestA {

    // final int score;  //���б���ʵ������������Ĭ��ֵ��ֱ�Ӽ�final���λᱨ��
	final int score=10;  //�����ֶ���ֵ���Ҹ�ֵ�󲻿������¸�ֵ��
	          

}