public class Date003{
    
	private int year;
	private int month;
	private int day;
    
	/*
	public Date003(){
		year=1900;
		month=10;
		day=25;
	    System.out.println(year+"��"+month+"��"+day+"��");

	}
	*/
	//���ϵļ��д����
	public Date003(){
	  //System.out.println("��һ��"); //���б���this()�����ڹ��췽�����ִ�г����һ����䣬����������
							          //�ɴ��Ƴ���һ�����췽��ֻ����һ��this���ñ�Ĺ��췽������Ϊthis()���ܳ����ڵڶ���
		this(1900,10,25);             //�˴����������в����Ĺ��췽����this()���Ӷ���������д�������
	                         
	
	}

	public  Date003(int year,int month,int day){
	    this.year=year;
		this.month=month;
		this.day=day;

		System.out.println(this.year+"��"+this.month+"��"+this.day+"��");
	
	}

}