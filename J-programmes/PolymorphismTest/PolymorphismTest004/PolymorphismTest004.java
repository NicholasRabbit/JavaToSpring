public class PolymorphismTest004 {

/*
Person���࣬Son���࣬��������������������name�������
�����Ǿ�̬̬�󶨣������Ƕ�̬�󶨡�
��̬�󶨾��Ǳ�������ʲô���ͣ������ĸ�����ġ�
���磬���p.name��p��Person���ͣ���ôname����Person���е�name��
������Ƕ�̬�󶨣���ô��ӱ������Ϳ�ʼ�����Ͳ��ҡ�
���name�Ƿ�������ô����p��Son���һ���������Ի��Son��ʼ��name����������Ҳ����ٵ��������ҡ�

*/
    
	public static void main(String[] args){
	
	    Father f=new Son();
		System.out.println(f.age);   //���Ϊ0����Ϊ������Son������������age,����ֵ����Ȼ��̬�﷨�£�����f���ú����ڴ��ַָ�����࣬
		                             //�����ڱ���׶�f��̬���˸��������age����Ϊ����������ʱ����������name, f���ڸ���Father
									 //���f.age��0.
        
		Father f2=new Son02(25);     //Son02������������ageû���������� 
		System.out.println(f2.age);  //������Ϊ25��������û����������age,����ʹ���вι��췽����ֵ���������ڶ�̬�󶨣�
		                             //f2�����н׶Σ���̬���������е�age��
	
	}


}

class Father {
    
    int age;
}

class Son extends Father{
	int age=10;
}

class Son02 extends Father{
	
	public Son02 (){       //����ageû������������
	
	}
	public Son02 (int age){
	   this.age=age;
	}
}