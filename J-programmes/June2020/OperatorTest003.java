public class OperatorTest003{
    public static void main(String[] args){
    int  a=20;
    int  b=a++;
    System.out.println(a);  //�˴����Ϊ21��ǰ����a++�Լ�1����
    System.out.println(b);
	//�˴����Ϊ20����ΪJava����������Ƿֿ��Ľ��̣����������ֻ���벻���㣻
	//��������˳���ǣ�������ֵ���㣬�����Լ�1���㣬���ڰ�˳����˵��ǰ��a����ֵ20�Ѿ���ֵ����b
	//����Ž����Լ�1����ǰ����������Ѿ����ˣ�����a++�Ľ���������b��

	int c=20;
	int d=++c;
	System.out.println(c);    //���21
	System.out.println(d);    //�Լ�1��++�ڱ���ǰ�棬���Ƚ����Լ�1���㣬�ٽ��и�ֵ���˴����21


}


}