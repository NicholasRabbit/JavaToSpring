public class SelectTest {

    public static void main(String[] args){
	
	    int[] arr={3,26,16,12,0,1};         //ѡ������ԭ������С�����ŵ������

		for(int i=0;i<arr.length-1;i++){    //������������ߵ������ұߵ��������Ƚϣ���һ�αȽ���������±�0���ڶ�����1���������ơ�   
		                                    //��ˣ�i=0,Ϊ��ʼֵ��length-1��ʾ�Ƚ�5�Σ������鳤��С1��
		    int min=i;
			for(int j=i+1;j<arr.length;j++){   //�����±�i����j=i+1Ϊ��ʼֵ����ʼѭ���Ƚϡ�
			    if(arr[j]<arr[min]){
				    min=j;                  //���if����������min��ֵΪj
				}
				if(min != i){               //�˴�����˵���б�arr[i]��С��������������ơ�
				   int temp;
				   temp=arr[i];
				   arr[i]=arr[min];
				   arr[min]=temp;
				}
				
			}
		}

		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
	
	}

}