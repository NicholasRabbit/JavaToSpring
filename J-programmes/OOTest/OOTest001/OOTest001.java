public class OOTest001{
    

	public static void main(String[] args){
	    Student s=new Student();                 //�˴�����Student���ͱ���������һ���ֲ��������ڷ������������������ڷ�������
		  
		/*
		int stuNum=s.number;                     //����ʵ����������ȡ���ݣ��﷨��ʽ������.��������ע��ǰ���������������s��

		byte stuAge=s.age;
		
		boolean stuGender=s.gender;

		String stuName=s.name;

		long stuHeight=s.height;

		
		System.out.println("stuNum  "+stuNum);
		System.out.println("stuAge  "+stuAge);
		System.out.println("stuGender  "+stuGender);
		System.out.println("stuName  "+stuName);
		System.out.println("stuHeight  "+stuHeight);
        */
		System.out.println("stuNum  "+s.number);      //��������ֱ�Ӽ򻯳�����д������������stuNum�ȱ�����ֱ�Ӵ�ӡ���
		System.out.println("stuAge  "+s.age);
		System.out.println("stuGender  "+s.gender);
		System.out.println("stuName  "+s.name);
		System.out.println("stuHeight  "+s.height);

		System.out.println("�ָ���~~~~~~~~~~~~~~~~~~");

		Student m=new Student();                      //�˴���������m���������������ã��ڶ��ڴ����������·������һ��ط�
                                                      //������s�����ڶ��ڴ��ﲻ��ͬһ��ط�
		
		m.number=10;                                  //�޸������﷨��ʽ                                
		int stuNum02=m.number;

		m.age=25;
		byte stuAge02=m.age;

		m.gender=true;
		boolean stuGender02=m.gender;

		m.name="Brady";
		String stuName02=m.name;

		m.height=170L;
		long stuHeight02=m.height;

		System.out.println("stuNum02  "+stuNum02);      //Ҳ����д����System.out.println("stuNum02  "+m.number);����һ��
		System.out.println("stuAge02  "+stuAge02);
		System.out.println("stuGender02  "+stuGender02);
		System.out.println("stuName02  "+stuName02);
		System.out.println("stuHeight02  "+stuHeight02);

		    

	
	}


}