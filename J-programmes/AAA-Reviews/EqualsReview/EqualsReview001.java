public class EqualsReview001 {

    public static void main(String[] args){
	
	    String s1=new String("Tom");
        String s2=new String("Jerry");
		String s3=new String("Tom");

		boolean b0=s1==s3;           //˫�ȺűȽ�����ʱ���Ƚϵ������ַ��������������ָ������ݡ�
		System.out.println(b0);
		
		boolean b1=s1.equals(s2);    //�Ƚ�������������Ҫ��equals������String������д��String������
		System.out.println(b1);

		boolean b2=s1.equals(s3);
		System.out.println(b2);
		
		System.out.println("~~~~~~~~~");

		Student st1 = new Student (5563, "���׵�");
		Student st2 = new Student (5566, "����˹");
		Student st3 = new Student (5563, "���׵�");
		boolean b3 = st1.equals(st2);
		System.out.println(b3);
		boolean b4 = st1.equals(st3);
		System.out.println(b4);

	}

}

class Student {

    private int id;
	private String name;

	public Student(){
	
	}
	public Student(int id, String name){
	    this.id=id;
		this.name=name;
	}

	public boolean equals (Object obj){
	
	    if(this==obj) {
			return true;
		}
		
		Student stu = (Student)obj;  //obj����Object����Ҫ����ת��

		if(obj==null || !(obj instanceof Student) || this.id != stu.id ){
		    return false;
		}else if(this.name.equals(stu.name) & this.id==stu.id){
		    return true;
		}
		return false;

	}

}