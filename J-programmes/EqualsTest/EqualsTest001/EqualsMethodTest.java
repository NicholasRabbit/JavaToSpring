public class EqualsMethodTest {

    public static void main(String[] args){
	
	   MyDate d1=new MyDate(2020,9,19);
	   MyDate d2=new MyDate(2020,9,19);

	   System.out.println(d1==d2);  //这里判断的事引用里所保存的内存地址是否一样,而不是日期。

       boolean b=d1.equals(d2);  //调用equals()方法,也是判断的内存地址是否相等。
	   System.out.println(b);

	}

}

class MyDate {

    private int year;
	private int month;
	private int day;

	public MyDate(){
	
	}
	public MyDate(int year, int month, int day){
	
	    this.year=year;
		this.month=month;
		this.day=day;
	}

	/*
	默认继承Object类，因此这里有一个系统 Object自带equals()方法。
	public boolean equals(Object obj) {
        return (this == obj);
    }
	*/


}