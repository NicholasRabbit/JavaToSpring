public class SelectTest {

    public static void main(String[] args){
	
	    int[] arr={6,5,4,3,2,1};         //ѡ������ԭ������С�����ŵ������
		select(arr);
		list(arr);
	}


	public static void select(int[] arr){
		int count = 0; //�Ƚϴ���
		int exchange = 0;  //��������
		
		for(int i=0;i<arr.length-1;i++){    //������������ߵ������ұߵ��������Ƚϣ���һ�αȽ���������±�0���ڶ�����1���������ơ�   
		                                    //��ˣ�i=0,Ϊ��ʼֵ��length-1��ʾ�Ƚ�5�Σ������鳤��С1��
		    int min=i;
			for(int j=i+1;j<arr.length;j++){   //�����±�i����j=i+1Ϊ��ʼֵ����ʼѭ���Ƚϡ�
			    count ++;
				if(arr[j]<arr[min]){
				    min=j;                  //���if����������min��ֵΪj
				}
				
				//д�����������û��Ҫÿ�ζ����������ڴ�forѭ����֮���ҵ���С�����ж�
				/*if(min != i){               //�˴�����˵���б�arr[i]��С��������������ơ�
				   exchange ++;
				   int temp;
				   temp=arr[i];
				   arr[i]=arr[min];
				   arr[min]=temp;
				}
				*/
				
			}

			//�ڴ�for�ж���֮����������н������˴�����˵���б�arr[i]��С��������������ơ�
			if(min != i){               
			   exchange ++;
			   int temp;
			   temp=arr[i];
			   arr[i]=arr[min];
			   arr[min]=temp;
			}
		}

		System.out.println("ѡ�����򷨱Ƚϴ���==>" + count);
		System.out.println("ѡ�����򷨽�������==>" + exchange);
	
	}


	//��������
	public static void list(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}


}