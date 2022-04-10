import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/*List接口里特有方法练习
  (1)void add(int index, E element); 向指定下标位置添加元素
  (2)E get(int index):  返回指定下表的元素
  (3)int indexOf(Object o) :指定某个元素第一次出现时的下标。
  (4)int lastIndexOf(Object o) :指定某个元素最后出现时的下标。
  (5)E set(int index, E element) :替换指定位置元素;
  (6)E remove(int index),移除指定下标的元素，并将后面元素左移，即下标也减1。

*/
public class ListTest001{

    public static void main(String[] args){
	
	    listMethod();
	
	}
	
	public static void listMethod(){
	
	    List myList=new ArrayList();
		myList.add(0,'A');     
		myList.add(1,"b");    //add(int index, E element)则向指定下标添加元素
		myList.add(2,"c");
		myList.add(3,"d");
		myList.add(4,"e");
		

		myList.add(2,'x');  //如果原位置有元素，再向此位置加元素，则原有元素统一向后移一位，同时下标也自动加1。  
		                    //此处向下标2处加元素，原2处元素后移，后面也顺移。
                            
		myList.add("d");	//继承自Collection的方法add(E e)自动向集合里最后一位添加元素
		

		Iterator it=myList.iterator();
		while(it.hasNext()){
		    Object o=it.next();
			System.out.println(o);
		}

        Object o=myList.get(1);
		System.out.println("下标1："+o);

		int i=myList.indexOf("d");
		System.out.println("d第一次出现下标: "+i);  //注意，因为向下标2位置处添加新元素了，其他元素都后移了，此处i为4,后面j为6

		int j=myList.lastIndexOf("d");
		System.out.println("d最后一次出现下标："+j);

        myList.set(2,"Hello");    //替换下标为2的元素X
		it=myList.iterator();     //前面迭代完了，这里要重新获取迭代器，否则下面it.hasNext()为false,while循环进不去
		while(it.hasNext()){
		    Object o2=it.next();
			System.out.println(o2);
		}

		System.out.println("分割线~~~~~~~~~~~~~~");
		//List里remove方法
		myList.remove(4);     //移除指定下标元素，后面元素向左移动，下标减一
		it=myList.iterator();
		while(it.hasNext()){
		    Object o3=it.next();
			System.out.println(o3);
		}




	}

}