public class User002{
    
	private int age;

/*
	public void setAge(int a){    //�˴��﷨��ȷ������a������ֵ��age,���漰��this
	    age=a;
	}
	public int getAge(){
	
	    return age;
	}
*/

    public void setAge(int age){   //�Ⱥź�ߺ�int���age�Ǿֲ�������this.age��ʵ������
	    this.age=age;              //���this�����þ��Ǳ�ʾ����age��ʵ��������
	}                              //�ֲ�������age��Ϊ�˼���֪��
	public int getAge(){
	    return age;
	
	}

}