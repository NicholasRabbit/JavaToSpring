public class BinarySearchTest {

    public static void main(String[] args){
	
	    int[] arr={1,2,3,4,5,6,7,8,9,10};   //�ö��ַ�����Ԫ�أ���Ե���������Ǵ�С�����ĺ���ġ�

		int retValue=searchMethod(arr, 10);
		System.out.println("10���±꣺"+retValue);

	
	}

	public static int searchMethod(int[] arr, int dest){
	
	    int head=0;
		int tail=arr.length-1;

		while (head<=tail){     //��ʼ�±�ֻҪ�ڽ����±����ߣ���һֱѭ����
		                        //�ҵ���dest��ʱ��Ҳ������β�±���ȵ�ʱ��
			
			int mid=(head+tail)/2;
			
			if(arr[mid]>dest){
			    tail=mid-1;
			}else if(arr[mid]<dest){
			    head=mid+1;
			}else{
			    return mid;    //��ʱ��arr(mid)==dest�������
				               //���ַ�����Ԫ�أ����dest�����������ѭ�����ն�Ҫ�õ�arr[mid]=dest
			}                  //����������������10��whileѭ������� int mid=(9+9)/2��������else{}����
			
		}
		return -1;     //ͨ��whileѭ����û���ҵ���dest��ȵ�Ԫ�أ��÷���-1��ʾ��

	
	}

}