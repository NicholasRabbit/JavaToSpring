
/*
1,������������ʵ�ֻ�������ӹ���
2,�趨�����һ���������ݣ�ֻ��һ��next����ָ����һ���ڵ㣬����ڵ�ĵ�ַ���ǵ�������ĵ�ַ
*/

public class TestSingleLinkedList {

	public static void main(String[] args){
		SingleLinkedList list = new SingleLinkedList();
		//1,add()������ӽڵ㣬������
		list.add(new NodeDemo(1001,"Tom"));
		list.add(new NodeDemo(1002,"Jerry"));
		list.add(new NodeDemo(1004,"Liam"));
		list.add(new NodeDemo(1003,"Liam"));
		list.show();
		
		System.out.println("�ָ���=============");
		//2,addByOrder(..)��ӽڵ㣬����������
		SingleLinkedList listOrder = new SingleLinkedList();
		listOrder.addByOrder(new NodeDemo(2001,"Lily"));
		listOrder.addByOrder(new NodeDemo(2004,"Daniel"));
		listOrder.addByOrder(new NodeDemo(2002,"Bill"));
		listOrder.addByOrder(new NodeDemo(2003,"Joseph"));
		listOrder.show();

	}
}

