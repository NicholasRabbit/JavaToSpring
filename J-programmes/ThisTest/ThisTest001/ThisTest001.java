public class ThisTest001{
    public static void main(String[] args){
	
		Athlete liuXiang=new Athlete();
		liuXiang.name="����";
		liuXiang.running();     //ʵ���������ã�����.������;

		Athlete yaoMing=new Athlete();
		yaoMing.name="Ҧ��";
		yaoMing.running();
 
        //��ͨ��������,����.������
		Athlete.doThis();


	}


}
