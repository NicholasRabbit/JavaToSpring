public class Athlete{
    String name;

	public Athlete(){
	
	}

	public void running(){
	
	    System.out.println(this.name+"������"); //this�������yaoMing����ʱ����yamMing
		                                        //liuXiang����ʱ����liuXiang,�ҿ���ʡ�ԡ�
		return;                                 //��this�Ļ������η��б��ﲻ����static 
	}

	public static void doThis(){
	    
		//System.out.println(name);             //��static�ؼ��ֵķ���������ֱ�ӷ���ʵ������name,���б���
	    
		Athlete messi=new Athlete();            //�������ڶ��ڴ��½���һ��ռ䣬�½��Ķ���
		System.out.println(messi.name);         
	
	}

}