public class LinkedListTest001 {

    public static void main(String[] args){
	
	    MyList ml=new MyList();
		Nodes n=new Nodes();
		ml.add(n);
		ml.add(new Nodes());
		ml.add(new Nodes());
		ml.add(new Nodes());
		ml.add(new Nodes());
		
		System.out.println(n.next);   //����Ϊʲô�˴�Ϊnull:��Ϊnֻ����Ϊ��һ���ڵ�first�����ԷŽ�ȥ�ˣ�n����һ���ڵ㣬����n.nextΪnull��

		System.out.println(ml.first);
		Nodes pointer=ml.first.next;
		while(pointer != null){
		   
			System.out.println(pointer);
			pointer=pointer.next;
		}
	
	}
	
	

}


class MyList {

    int size;
	Nodes first;
	Nodes last;

	public boolean add(Nodes e){
	
	    Nodes l=last;
		Nodes newNode=new Nodes(e, null);
		last=newNode;
		if(l == null){
		    first=newNode;
			size++;
		    System.out.println("��"+size+"��Ԫ����ӳɹ�");
		}else{
		    l.next=newNode;
			size++;
		    System.out.println("��"+size+"��Ԫ����ӳɹ�");
		}

		

		return true;
		

	}


}

class Nodes {

    Nodes element;
	Nodes next;

	public Nodes () {
	
	}

	public Nodes (Nodes elemdent,Nodes next){
	    this.element = element;
		this.next = next;
	}

}