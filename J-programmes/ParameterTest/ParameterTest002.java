public class ParameterTest002{
    
	public static void main(String[] args){
	    Human h=new Human(30);                     //���췽�������ɶ��󣬴˴�main�������h�������new Huamn(30)�ĵ�ַ��Ȼ�󴫸�������plus�������h,
		                                           //������h�ڲ�ͬ�������ջ�ڴ������鲻ͬ���ڴ�ռ�,
		                                           //����h����ĵ�ַ��ͬ�������Ǳ���ĵ�ַ��ͬ,����Ķ���Human����ĵ�ַ
		ParameterTest002.plus(h);                  //����plus����,ʵ��Ϊh,������һ�������ַ���Ǹ������ֵ,�Ǵ������h�ﴫ�����ĵ�ַ��
		System.out.println("main-----> "+h.age);   //���21��

	
	}
	public static void plus(Human h){              //��ʽ�����б�(Human h)������(int i),ֻ����i����������ֵ����h�ﱣ����Ƕ���ĵ�ַ��            
	    h.age++;                                   //h.age=age+1,����(h.age=30+1)����ʵ��������ֵ��
		System.out.println("plus-----> "+h.age);   //���21��

	
	}

}
class Human{
    int age;
	
	public Human(int m){
	    age=m;
	
	}
	

}