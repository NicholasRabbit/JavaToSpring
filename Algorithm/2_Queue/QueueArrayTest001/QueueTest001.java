import java.util.Scanner;

//����һ������ģ��Ķ���
//���ֵ����⣺��Ԫ�����������ȫ��ȡ���󣬶����ѿ��ˣ�������ʵ����Ӳ����Ļ���ʾ������������
public class QueueTest001 {
	
	public static void main(String[] args){
		
		ArrayQueue  queue = new ArrayQueue(5); //��ʼ�����������

		char key = ' ';   //����һ�����ַ��������û��ͻ��˵�����
		Scanner scan = new Scanner(System.in);
		boolean loop = true;  
		while(loop){
			System.out.println("s(show):չʾ����");
			System.out.println("a(add):���Ԫ��");
			System.out.println("g(get):ȡ��ͷ��Ԫ��");
			System.out.println("h(head):�鿴����ͷ����Ԫ��");
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
				System.out.println("head value==>" + queue.headValue());
				break;
			}
		}
		
	}

	
}