public class SuperTest004 {

    public static void main(String[] args){
	
	   
	}

}

class Father {

	int age;

	public Father (int age){     
	    this.age=age;            
		                         
	}
}

//������ֻ��һ����д�вι��췽������ô�����б�����дһ��super(�в�)ȥ���ø���������췽�������򱨴�                                           
//�������ʲôҲ��д����ϵͳĬ�ϸ�һ���޲ι��죬�������һ��Ĭ�ϸ���super(),��Ϊsuper()û�в������޷�                                         
//���ø�����вι��췽������˱�����Ϊ��������д�вι��죬�޲ι��첻��д��û����,�����޲ε�super()��û�����á�                            
class Son extends Father {
    
    public Son(){
	    super(10);
	}

	public Son(int age){
	    super(age);
	}


}
