public class TwoDimensionalArrayTest {
    public static void main(String[] args){
         arrayMethod();

    }

    public static void arrayMethod(){



        //1����̬��ʼ����ά���顣���ڲ�ÿ����Ԫ����һ�����飬ע�������������š�
        int[][]  array1 = {
                {11,12,13,14,15},
                {21,22,23},
                {31,32,33,34,35,36},
                {41,42,43,44,45,46},
                {51,52,53,54,55}
        };

        //��ȡ�����е�Ԫ�أ�
        int[] a=array1[0];
        int b=a[0];
        System.out.println(b);
        
		//����ļ��д��:
        System.out.println(array1[0][0]);

        System.out.println("��ά���鳤��:"+array1.length);

        for(int i=0;i<array1.length;i++){
            System.out.println("��"+i+"����ά�����Ԫ�صĳ��ȣ�"+array1[i].length);
            //������ά���飺
            for (int j = 0; j <array1[i].length ; j++) {
                System.out.print(array1[i][j]+"  ");
            }
            System.out.print('\n');    //ÿ��Ԫ��һά���������󣬻��С�
        }
		

		//2����̬��ʼ����ά��������ַ�ʽ
		//��ά����ĵڶ���������ʽ
		int[][] array3 = new int[5][5];
		int[] array2[] = new int[2][5];

		//��ά����������ʱ�򣬵�һλ����ָ���������ڶ�ά���Բ�ָ������
		//����ڶ�άû��ָ����������ô�ڶ�ά�е�ֵȫ����null����Ϊ���鱾����һ������

        //int[][] arr = new int[][];  //���ﱨ��ȱ������ά��

		//�ڶ�ά��arr[0],arr[1]û��ʼ����Ĭ��Ϊnull���൱������������null
		//��˲��ܸ�ֵ������ָ��
        int[][] arr = new int[2][]; 
        System.out.println(arr[0]);  

		//arr[0][0] = 15;  //����һά��һ��Ԫ�صĵڶ�ά��һ��λ�ø�ֵ������ʱ����������ʱ����nullPointer��

		//��ȷ��ʼ����ֵд��
		arr[0] = new int[5];

		/* 
		 * ���в����þ�̬��ʼ���ķ�ʽ��
		 * ԭ���ǵڶ�ά�������Ѿ������ҳ�ʼ��Ϊnull�ˣ�{...}����ʽֻ�����ڳ�ʼ����ʱ��ֵ
		 * */
		//arr[1] = {1,2,3};   //����

		System.out.println(arr[0][4]);
		
		//��������ͬ��
        String[][] chs = new String[2][];




    }

}
