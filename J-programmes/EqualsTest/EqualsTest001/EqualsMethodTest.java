public class EqualsMethodTest {

    public static void main(String[] args){
	
	   MyDate d1=new MyDate(2020,9,19);
	   MyDate d2=new MyDate(2020,9,19);

	   System.out.println(d1==d2);  //�����жϵ�����������������ڴ��ַ�Ƿ�һ��,���������ڡ�

       boolean b=d1.equals(d2);  //����equals()����,Ҳ���жϵ��ڴ��ַ�Ƿ���ȡ�
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
	Ĭ�ϼ̳�Object�࣬���������һ��ϵͳ Object�Դ�equals()������
	public boolean equals(Object obj) {
        return (this == obj);
    }
	*/


}