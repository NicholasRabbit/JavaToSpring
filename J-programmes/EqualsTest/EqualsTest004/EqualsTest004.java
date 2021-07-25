public class EqualsTest004 {

    public static void main(String[] args){
	
	    Student s1=new Student(2300,"����һ��");
		Student s2=new Student(2300,"����һ��");
        boolean b=s1.equals(s2);   //�ж����ѧ���ǲ���ͬһ���ˡ�
        System.out.println(b);     //���Ϊtrue��
	}

}

class Student {

    private int no;
	private String name;     //ѧУ����

	public Student(){
	
	}
	public Student(int no, String name){
	    this.no=no;
		this.name=name;
		System.out.println(no+name);
	
	}

	public boolean equals(Object obj){
	     
		 if(obj==null|!(obj instanceof Student)){
		     return false;
		 }

		 if(this==obj)  return true;  //if��ֻ��һ�������ţ���ʡ�Բ�д��

		 Student stu=(Student)obj;           //obj����Object������ã��������������е�ʵ��������ʱ����Ҫ����ת�ͣ����򱨴�

		 if(this.name.equals(stu.name)){     //��Ϊ�����������ͱ�����name�����о������ݣ�����һ���ڴ��ַ��ָ��java�ڶ��ڴ����Զ�������String�����  
		                                     //������Ҫ��һ������String����s1,s2��name��equals()��д��ķ���,���Ƚ������ں����ַ���,����дs1.equals(s2)��
		     return true;                   
		 }

		 return false;
		 
	    
	
	}



}