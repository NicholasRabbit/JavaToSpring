public class EqualsTest002 {

    public static void main(String[] args){
	
	    MyTime t1=new MyTime(2020,9,19);
		MyTime t2=new MyTime(2020,9,19);
		MyTime t3=new MyTime(1949,10,1);

		boolean b1=t1.equals(t2);
		System.out.println(b1);

		boolean b2=t1.equals(t3);
		System.out.println(b2);

	}

}

class MyTime{

    private int year;
	private int month;
	private int day;

	public MyTime(){
	
	}
	public MyTime(int year, int month, int day){
	
	    this.year=year;
		this.month=month;
		this.day=day;
	
	}

	/*
	public boolean equals(Object obj){    //equals()�����м��棬�����϶�Դ�롣������ȫ��if,else��䡣
	    if(obj==null){
		
		    return false;

		}else if(!(obj instanceof MyTime)){
		    
            return false;

		}else if(obj instanceof MyTime){
		
		    MyTime m=(MyTime)obj;   //Object����MyTime����������year,month,day������Ҫ����ת�͡�
			if(this.year==m.year&this.month==m.month&this.day==m.day){
			    return true;
			}else{
			    return false;
			}
		
		}else{
		
		    return false;
		}
		

	}
	*/

	//����equals()�����ļ��档
	public boolean equals(Object obj){
	
	    if(obj==null||!(obj instanceof MyTime)){
		
		    return false;
		}
		
		
		//Object����MyTime����������year,month,day������Ҫ����ת�͡�
		//ֱ��obj.year����
		//����ִ�е�����˵��ǰ���if��䲻�������������û��Ҫ��дif�ˣ�����Ŀ϶�������
		MyTime m=(MyTime)obj;     
        return this.year==m.year&&this.month==m.month&&this.day==m.day;
	
	}



}