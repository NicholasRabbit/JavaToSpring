public class Customer001{
      private int score;

	  public void setScore(int m){
	      if(m<0|m>100){                       //�˴���ֹ�������븺�ķ����������100�ķ�������ֹ��������������
		      System.out.println("�������!"); //��������װ�����ݰ�ȫ��
			  return;
		  
		  }
		  score=m;
      
	  }

	  public int getScore(){
	     return score;
	  
	  }


}