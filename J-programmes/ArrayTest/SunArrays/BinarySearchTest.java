import java.util.Arrays;

public class BinarySearchTest {

    public static void main(String[] args){
	
	    int[] arr={26,36,22,66,0,45};       
		Arrays.sort(arr);                  //Arrays������ַ����ҷ���binarySearch()����ʹ��ǰ����������������������
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);    //{0,22,26,36,45,66}


		}
                                                    //binarySearch()�Ǿ�̬������
		int retValue=Arrays.binarySearch(arr,26);   //�������������±꣬û�з��ظ���
		int retValue2=Arrays.binarySearch(arr,100);
		System.out.println("�������±꣺"+retValue); 
		System.out.println("�������±꣺"+retValue2); 
	
	}

}