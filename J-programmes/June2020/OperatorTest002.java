public class OperatorTest002{
    public static void main(String[] args){
    int a=20;
    int b=10;
    System.out.println(a<b&++a<b);    //�˴��߼��룬�������ӽ��м��㣬�������a���Ϊ10
    System.out.println(a);             
    int c=20;
	int d=10;
	System.out.println(c<d&&++c<d);
	//�˴���·�룬����ǰ�����ӽ��Ϊfalse,���Ժ������۽����ʲô�������߼���������false
	//���԰���Java�Ĺ涨���������ӱ���·�ˣ��������㣬����c�����Ϊ20
	System.out.println(c);






}


}