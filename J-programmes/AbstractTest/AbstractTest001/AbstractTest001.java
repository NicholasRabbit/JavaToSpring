public  class AbstractTest001 {

    public static void main(String[] args){
	
	   // Car camry=new Car();   //���󷽷��޷�ʵ���������޷���������

	   new Sedan();              //�������࣬�̳��ڳ�������������ʵ������
	}

}

abstract class Car {

   
}

class Sedan extends Car {

    
}

abstract class Saloon extends Car {    //��������Ա������̳У����������������໹���Ա�����

}

abstract class Toyota extends Saloon {

}