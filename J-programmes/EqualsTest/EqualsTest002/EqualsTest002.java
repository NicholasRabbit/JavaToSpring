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
	public boolean equals(Object obj){    //equals()方法有简洁版，参照老杜源码。这里完全用if,else语句。
	    if(obj==null){
		
		    return false;

		}else if(!(obj instanceof MyTime)){
		    
            return false;

		}else if(obj instanceof MyTime){
		
		    MyTime m=(MyTime)obj;   //Object子类MyTime里特有属性year,month,day。所以要向下转型。
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

	//以上equals()方法的简洁版。
	public boolean equals(Object obj){
	
	    if(obj==null||!(obj instanceof MyTime)){
		
		    return false;
		}
		
		
		//Object子类MyTime里特有属性year,month,day。所以要向下转型。
		//直接obj.year错误。
		//程序执行到这里说明前面的if语句不成立，因此这里没必要再写if了，下面的肯定成立。
		MyTime m=(MyTime)obj;     
        return this.year==m.year&&this.month==m.month&&this.day==m.day;
	
	}



}