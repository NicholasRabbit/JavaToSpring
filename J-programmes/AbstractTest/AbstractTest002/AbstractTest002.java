public abstract class AbstractTest002 {

    public AbstractTest002(){               //������������й��췽������Ϊ��������Ĭ�ϵ��޲������췽������Ĭ���ں�super(),
	                                        //���ø�����޲������췽����
	}

	public AbstractTest002(int num){        //��������Ҳ�������вι��췽��
	
	
	}

	public void mdthod01(){
	
	}
	
	public abstract void method02();       //������������г��󷽷������󷽷���ִ�У��޷����壬���޴����š�
                                           //�������ﲻһ���г��󷽷������ǳ��󷽷�һ�������ڳ������
                                           //���������̳г�����,����ͬʱҲ�̳��˳��󷽷�����������ǳ����࣬������뱨��


   // private abstract void method03();    //abstract��privateҲ�������á�
}


abstract class User01 extends AbstractTest002 {

    public User01(){
	    super();
	}

}



/*
abstract final class User02 {   //abstract��final�������á�

}
*/

/*
class User03 extends AbstractTest002 {}     //������������г��󷽷�����ôһ���಻�ܼ̳г����࣬����̳��Ǿͼ̳��˳��󷽷�,
                                            //���󷽷����ܳ�����һ������
*/