/*����ʹ�û�����������1�г��ֵ�����
���˼·������ȡ������˼·��ʹ��head,tail��ͷ�ߵ�����β��ʱ�������Ԫ����ѭ��������ͷ��
Ҳ���԰ѻ�����������������������߽ӵ�һ��ͬ�����ȵ����飬�±�һֱ��0-4
*/

public class CircleArrayQueue {
	
	//ͷ����ͷָ������ĵ�һ��Ԫ�أ���QueueArrayTest001�ﲻһ��
	private int head;	
	//β����ͷָ�����һ��Ԫ�ص���һλ��������Ҳ��һ������һ��λ��ռ�������е�һλ��ʼ��Ϊ�գ�Ҳ���Բ�����λ
	private int tail;	
	private int maxSize;
	private int[] circleArr;

	public CircleArrayQueue(){
	}
	//ʹ�ù��췽����ʼ������
	public CircleArrayQueue(int maxSize){
		this.maxSize = maxSize;
		this.circleArr = new int[maxSize];
		//��ʼ��head,tailΪ0������tailΪ0Ŀ��������һ�����е�λ�ã�Ҳ���Բ���
		//��ʼ�������Բ�д��ʵ������Ĭ��ֵ����0
		this.head = 0;  
		this.tail = 0;
	}

	//1,���Ԫ��
	public void add(int element){
		if(isFull()){
			System.out.println("����������");
			return;
		}
		circleArr[tail] = element;
		tail++;
	}
	
	//2,ȡ��ͷ��Ԫ��
	public int get(){
		//����ʹ��ȡ�����ķ�����ȡ�±꣬�Ժ�indexһֱ��0-4֮��ѭ�����Ӷ�ʵ����ѭ�������Ч��
		//����˼·����©����head++һֱ�ӵĻ������ܻ����int����ֵ����
		/*int index = head % maxSize;
		int headValue = circleArr[index];
		head++;   //������ݶ࣬head�ᳬ��int��Χ
		return headValue;  */

		//�Ż�����
		if(isEmpty()){
			System.out.println("û��Ԫ�أ�����Ϊ�գ�");
			return -1;
		}
		int headValue = circleArr[head];
		head = (head + 1) % maxSize; //head����һλ��������ȡ�������ٸ�head��ֵ���ɽ�����泬������
		return headValue;
	}

	//3,�鿴�������ж��ٸ�Ԫ��
	public int getSize(){

		//����Ӹ��ж϶���Ϊ��
		if(isEmpty()){
			System.out.println("����Ԫ������Ϊ0��");
		}
		//��������е�Ԫ�صĸ���
		//tail + maxSizeʵ��˼·���ǰ�һ���µ���ͬ����ŵ����棬���tail���±���Ҫ�ټ�һ��maxSize, Ȼ���ٸ�head���
		int size = (tail + maxSize - head) % maxSize;
		return size;
	}

	//4,��������
	public void showAll(){
		//�ж��Ƿ�Ϊ��
		if(isEmpty()){
			System.out.println("����Ϊ�գ�");
		}

		for(int i = head; i < head + getSize(); i++){
			int index = i % maxSize;  //����Ҫȡ��������������׳����鳬���쳣
			System.out.println("circleArr�±�: " + index + "==>" + circleArr[index]);
		}
	}

	//5,�鿴ͷ��Ԫ��
	public int getHead(){
		return circleArr[head];
	}


	
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty(){
		return head == tail;
	}

	//�ж϶����Ƿ�����
	public boolean isFull(){
		//����tail + 1��������һ����λ�ã����Բ����������Ļ�����������tail��ѭ��ָ��0��λ��
		boolean isFull = (tail + 1) % maxSize == 0;
		return isFull;
	}

}