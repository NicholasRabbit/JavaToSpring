public class FinalTest004 {

    public static void main(String[] args){
	
	   Player player01=new Player(10);
	          player01=new Player(20);   //����player01���¸�ֵ��ǰ���Ǹ�new Plyer(10)�����û������ָ���ˣ��ᱻ������������
                                         //player01ָ���µĶ���new Player(20)��
       
	   final Player player02=new Player();    //final�������ã����ں�ָ�����ĵ�ַ���ٸı�
	                //player02=new Player();  //���б�������player02�ں��ĵ�ַ�Ѿ��̶���,������ָ���¶��󲻿��ԡ�

                    player02.age=50;
					player02.age=60;          //��Ȼplay02�ڵ�ַ���䣬�������ڵı��������¸�ֵ����Ӱ��
					
	         
	        
	       

	}

}