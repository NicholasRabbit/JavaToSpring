public class Son extends Father {
    
	byte score;

    public Son(){
	
	//super();          //�˴��޲ι��췽���ڣ�ϵͳĬ�ϸ�һ��super(),һ�㲻��ʾ�������ø�������޲ι��췽����
	//super("10",100);  //һ��������������޲ι��췽��������д��super()��super(ʵ��)��
				        //��ô��ϵͳĬ�ϸ���super()��û���ˡ�
	}

	public Son(String name,int age,byte score){
	
	    //this.name=name;      //�����б���������name,age��˽�����ԣ��޷����̳У����thisҲ�޷�ʹ�á�
		//this.age=age;

		super("��������",50);  //super���ø����вι��췽����super�������ǣ�����ǰ����ĸ�������������ֵ����ʹ���������˽�еģ�
		this.score=score;      //����super(ʵ��)�����ᴴ���µĸ������ ����super()Ҳ���ᡣ
		                       //super����ֻ�ܷ������췽����һ�С���ˣ�ֻ��һ�䡣
	}

}