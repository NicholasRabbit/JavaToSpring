public class ExtendsTest005 {

    public static void main(String[] args){
	    
	    Animal r=new Rabbit();
	    //r.name="����";           //��̬�﷨�£�����r��Ȼ�ڴ��ַָ��Rabbit���󣬵���������Rabbit��������ʱ����������ת�͡�
		Rabbit rabbit=(Rabbit)r;
		rabbit.name="����";
		System.out.println(rabbit.name);

		r.weight=10;              //�̳��������ԣ�����ת��
		System.out.println(r.weight);
	}

}

class Animal {
    int weight;

}

class Rabbit extends Animal {
    //int weight;   //�̳����ԣ��ɲ�д
	String name;

}