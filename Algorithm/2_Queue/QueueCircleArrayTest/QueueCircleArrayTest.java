import java.util.Scanner;

public class QueueCircleArrayTest {

	public static void main(String[] args){
		CircleArrayQueue  queue = new CircleArrayQueue(5);

		char key = ' ';   //����һ�����ַ��������û��ͻ��˵�����
		Scanner scan = new Scanner(System.in);
		boolean loop = true;  
		while(loop){
			System.out.println("==============");
			System.out.println("s(show):չʾ����");
			System.out.println("a(add):���Ԫ��");
			System.out.println("g(get):ȡ��ͷ��Ԫ��");
			System.out.println("h(head):�鿴����ͷ����Ԫ��");
			System.out.println("z(size):�鿴������Ԫ������");
			System.out.println("==============");
			key = scan.next().charAt(0);  //��ȡ�û������ָ��
			switch (key){
			case 's' :
				queue.showAll();	
				break;
			case 'a' :
				System.out.println("�����һ�����֣�");
				int element = scan.nextInt();
				queue.add(element);
				break;
			case 'g' :   //ȡ��ͷ��Ԫ�غ�head��ͷ�ͺ���һλ����ʱ��Ȼ������ԭ����ͷ��Ԫ�ػ��ڣ������Ѿ�����ָ���ˣ�������������
				int value = queue.get();
				System.out.println("ȡ��ͷ��Ԫ��==>" + value);
				break;
			case 'h' :
				System.out.println("head value==>" + queue.getHead());
				break;
			case 'z' :
				System.out.println("queue size==>" + queue.getSize());
			}
		}
		
	}


	
}