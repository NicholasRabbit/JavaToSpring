import java.util.Random;

public class RandomTest002B {                //�������5����ͬ���������Ž����飬����

    public static void main(String[] args){
	
	    Random rdm=new Random();
		int[] arr=new int[5];

		for(int j=0;j<arr.length;j++){   //������ĳ�ʼֵ��0��Ϊ-1����ֹ�����������0,��Ĭ��ֵ��ͬ���Ų���ȥ��
		    arr[j]=-1;   
		}

		int i=0;
		while(i<5){                   
		    
			int k=rdm.nextInt(5);    //���ﺬ���ǣ�����0-4��Χ�ڽ���5���������������5���Դ���֤whileѭ���Ƿ���ȷ����5����ͬ������Ƿ�ֻҪ�����ɣ���һֱѭ����
			
			if(!contains(arr,k)){    //�ص���if()���ŵ��ڵķ�����ѧϰ����˼·���÷����ķ���ֵ����Ϊ�����ж���١�
			   arr[i]=k;
			   i++;
			}
		}

		//�������ɵ���������ѡ������
		for(int m=0; m<arr.length; m++){
		    int min=m;
            for(int n=m+1; n<arr.length; n++){
			    if(arr[min]>arr[n]){
				    min=n;
				}
			}
			if(min!=m){
			    int temp;
				temp=arr[m];
				arr[m]=arr[min];
				arr[min]=temp;
			}
		}

		//������������ӡ
		for(int a=0;a<arr.length;a++){
		    System.out.println(arr[a]);
		}
		
	
	}

	public static boolean contains(int[] arr, int k){     //�ж��������Ƿ����ĳ��Ԫ�صķ���������ֵ�������͡�
	
	    for(int i=0; i<arr.length; i++){
		    if(arr[i]==k){
			   return true;
			}
		}

		return false;
	
	}

}