public class OperatorTest005{
    public static void main(String[] args){
        int e,f,g,h;
             e=10;
             f=20;
             g=30;
             h=10;
        System.out.println(e<f||h<g++);   //��·��||��ǰ�������Ѿ�Ϊtrue�������·��������
        System.out.println(g);            //�˴�g���ֵΪ30
        System.out.println(f>e|h++>e);    //�˴��߼���|������ǰ�����ӽ��Ϊ�Σ����涼Ҫ����
		System.out.println(h);            //�˴�h���ֵΪ11��ǰ���Լ�1�����˱���
}



}