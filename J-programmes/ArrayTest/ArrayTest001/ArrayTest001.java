public class ArrayTest001 {
    public static void main(String[] args) {
        int[] array1={10,15,60,23,63};     //��̬��ʼ�����顣
        System.out.println("array1���鳤�ȣ�"+array1.length);

        System.out.println("�����һ����ֵ"+array1[0]);  //��ӡ��������һ��ֵ
        System.out.println("�������һ����ֵ"+array1[4]); //���һ��ֵ���ǵ�������±���4��
        System.out.println("�������һ��ֵ"+array1[array1.length-1]);  //���һ��ֵҲ�ǳ��ȼ�1��

        //�޸������е�ֵ��
        array1[0]=30;                       //�޸ĵ�һ��ֵ
        System.out.println(array1[0]);

        array1[2]=120;                      //�޸ĵ�����
        System.out.println(array1[2]);

        byte[] b={11,22,33,44,55,66};
        System.out.println("byte�����������:"+b[2]);
        b[2]=99;
        System.out.println("byte������������޸ĺ�:"+b[2]);


        int[] array2=new int[10];    //��̬��ʼ�����飬��ʮ��������Ĭ��ֵ��0��
        System.out.println("��ʼ��Ĭ��ֵ��"+array2[0]);
        array2[0]=10;
        System.out.println("��̬��ʼ�����飬��һ�����޸ĺ�"+array2[0]);


    }

}
