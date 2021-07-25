import java.util.Arrays;

public class CopyOfTest {
    
    public static void main(String[] args){
	 
	    //(1) һά����ĸ���ʹ��copyOf������Ԫ���ǻ�����������
		int[] arr={1,2,3,4,5};                //Arrays���copyOf��̬��������ֵ���飬���ҿ����ӳ��ȣ������ӵ�Ԫ�ظ����������͵�Ĭ��ֵ��
		int[] retArr=Arrays.copyOf(arr,10);   //copyOf()�������أ��β��ж������͵����飬�˴�����int[]���顣ʹ��copyOf������ʱ��ΪretArr�������µ��ڴ��ַ��
		for (int i=0;i<retArr.length ;i++ ){  

            System.out.println(retArr[i]);   
		}
		System.out.println(arr);     //[I@15db9742   
		System.out.println(retArr);  //[I@6d06d69c   ˵������������������ڴ��ַ��һ��
		
		
		char[] arr2={'a','b','c','d','e'};
		char[] retArr2=Arrays.copyOf(arr2,10);              //�β���char[]���顣     
		for (int i=0;i<retArr.length ;i++ ){  
            System.out.println(i+"�±����:"+retArr2[i]);   //char����Ĭ��ֵ��,��һ����'\\u0000'�����ǿո� 
		}
		
		
		//(2) һά���飬Ԫ���Ƕ���ʱ��ʹ��copyOf����,��֤copyOf()�����������飬���ڶ����ַ�Ƿ���ԭ��������ͬ��
		User u1,u2,u3;
		     u1=new User();
			 u2=new User();
			 u3=new User();

		User[] uArr={u1,u2,u3};
		User[] uArrCopy=Arrays.copyOf(uArr, uArr.length);
		
		System.out.println(uArr==uArrCopy);     //����������ʹ��copyOf��������������������ַ��ͬ

		for(int i=0;i<uArr.length;i++){
		    System.out.println(uArr[i]==uArrCopy[i]);   //�����¾�����Ƚ������ڴ��ַ,�����Ϊtrue
			                                            //��Ԫ��Ϊ����ʱ,��������Ԫ�ص�ַ���������Ԫ�����õ�ַ��ͬ��˵��������ʹ���˾������ڵ�����
		}
		



		//(3) ��ά������ϰʹ��copyOf()������ע�⣬��java�У�һά�����Ǳ��������󣬼��������������������ġ�
		int[][] arr3={{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}, {13,14,15}};
		System.out.println("arr3[0][0]: "+arr3[0][0]);  //�����arr3[0][0]: 1 (ע��Ƚ�)
		
		int[][] arr4=Arrays.copyOf(arr3,arr3.length);  //�¶�ά�����е�ÿ��һά������ԭ����ĵ�ַ����ͬ�ģ���ֱ���ù����ģ�û���½�
		
		arr4[0][0]=0;                                  //arr4[0][0]��arr4[0]�������һά����ĵ�ַ��ԭ����arr3[0]�ĵ�ַ��ͬ����������Ҳ��arr3[0][0]��ֵΪ0��
		
		System.out.println("arr4[0][0]: "+arr4[0][0]);  //�����arr4[0][0]: 0
		System.out.println("arr3[0][0]: "+arr3[0][0]);  //�����arr3[0][0]: 0  (ע��Ƚ�)

		 //�����Ͻ��۵�֪�����ƻ������ά���飬������copyOf()��������Ϊ������µĶ�ά���鸳ֵ����ͬʱ�ı���ԭ�����ڵ�һλ���顣
		 //���ƶ�ά������ȷ�ķ�������forѭ����

		int[][] arr5={{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}, {13,14,15}};
		int[][] arr6=new int[arr3.length][];   //�˴������µĶ�ά����,����ÿ��һλ���鶼���µĶ���Ĭ��ֵnull,������鲻ͬ
		System.out.println(arr6[0]);           //���null,Ĭ��ֵ
		
		for(int i=0;i<arr5.length;i++){
		     arr6[i]=Arrays.copyOf(arr5[i],arr5[i].length);   //ʹ��Arrays.copyOf()�����ǣ�Ϊһλ���飨Ԫ�أ�arr6[i]������µĵ�ַ������ԭһά���鲻ͬ
			 System.out.println(arr6[i]==arr5[i]);            //ȫ��Ϊfalse��
		}
		arr6[0][0]=0;
		System.out.println("arr5[0][0]: "+arr5[0][0]);
		System.out.println("arr6[0][0]: "+arr6[0][0]);

	
	}

	

}

class User {

}