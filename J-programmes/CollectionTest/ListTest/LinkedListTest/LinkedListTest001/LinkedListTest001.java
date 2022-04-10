public class LinkedListTest001 {

    public static void main(String[] args){
	
	    MyList ml=new MyList();
		Nodes n=new Nodes();
		ml.add(n);
		ml.add(new Nodes());
		ml.add(new Nodes());
		ml.add(new Nodes());
		ml.add(new Nodes());
		
		System.out.println(n.next);   //分析为什么此处为null:因为n只是作为第一个节点first的属性放进去了，n不是一个节点，所以n.next为null。

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
		    System.out.println("第"+size+"个元素添加成功");
		}else{
		    l.next=newNode;
			size++;
		    System.out.println("第"+size+"个元素添加成功");
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