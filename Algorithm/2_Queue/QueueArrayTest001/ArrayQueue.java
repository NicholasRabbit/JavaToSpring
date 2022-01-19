//�������
//��дһ����ͨ����ģ����У���������ֵ�����
public class ArrayQueue {
	
	private int head;		//ָ����е�һ��Ԫ�ص�ǰһλ
	private int tail;		//ָ����е����һ��Ԫ��
	private int maxSize;	//������������
	private int[] arr;      //�������

	public ArrayQueue(){
	}
	
	//1,��ʼ�����У�ȷ�����������
	public ArrayQueue(int maxSize){
		this.maxSize = maxSize;
		this.arr = new int[maxSize];
		head = -1;
		tail = -1;
	}
	

	//2,���Ԫ��
	public void add(int element){
		if(isFull()){
			System.out.println("����������");
			return;
		}
		tail++;      //tail��ͷ����ƶ�һλ��ָ��յ�λ�������Ԫ��
		arr[tail] = element;  //����tail++�ˣ����ﲻҪ��дarr[tail+1]��
	}

	//3,ȡ������ͷ��Ԫ��,
	public int get(){
		if(isEmpty()){
			System.out.println("�����ѿգ�");
			return -1;
		}
		//head����ƶ�һλ��ָ���һ��Ԫ�أ�������ȡ��
		head++;
		//return�����Ƴ�ͷ��Ԫ�أ�����head����ָ���һ��Ԫ��ǰ�Ŀ�λ��,����趨headָ���һ��Ԫ��ǰһλʹ�����࣬�߼������ˣ�
		return arr[head]; 
	}

	//4,�鿴����ͷ��Ԫ��
	public int headValue(){
		return arr[head + 1];
	}

	//5,�ж϶����Ƿ�Ϊ��
	public boolean isEmpty(){
		//�����βtail����head,˵��tailû��ָ���κ�Ԫ�أ���tail�±�Ҳ���ָ��0ʱȡ��һ��Ԫ�غ󣬱�Ϊ-1��
		boolean isEmpty = (head == tail);
		return isEmpty;
	}
	//6,�ж϶����Ƿ�����
	public boolean isFull(){
	   return tail == maxSize -1; //������length - 1
	}

	//7,չʾ���ж����ڵ�Ԫ��
	public void showAll(){
		for (int i=0; i<arr.length; i++ ){
			System.out.println(i + "==>" + arr[i]);
		}
	}

}