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


		//�����ʼ������ֵע�����
		//ע�⣺��������֮��������{...}����ʽ��ֵ��������ʽֻ�����ڳ�ʼ����ֵ��
		//ԭ�򣺸����Ʋ���ܸ�C�е�ԭ�����ƣ�{...}����ֵʱ��ʾ���ö�������������, ���Ⱥ�������������͡�
		int[] array3;
		//array3 = {1,2,3};  //���б���
		int[] array31 = {23,24,25};
		//array31 = {31,32,33};  //���б���
		
		int[] array32;
		array32 = new int[5];   //ʹ�ö�̬��ʼ���ķ�ʽ��ֵ������



		//�������������ַ�ʽ��ֵ
		int[] array4;
		array3 = new int[5];
		array4 = new int[]{4,5,6};

		//ע��2��Java�в�ͬ�������ü�����໥��ֵ��C�����в�����
		//�����໥��ֵ��������
		int[] m = {1,2,3};
		int[] n = {4,5,6};
		int[] p = {7,8,9,10};
		int[] r = new int[10];
		m = n;
		p = m;
		r = m;
		for(int i = 0; i < n.length; i++){
			System.out.println("m:" + m[i]);		
		}
		for(int i = 0; i < p.length; i++){
			System.out.println("p:" + p[i]);		
		}
		for(int i = 0; i < r.length; i++){
			System.out.println("r:" + r[i]);		
		}




    }

}
