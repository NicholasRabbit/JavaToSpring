import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;

public class RemoveTest001 {

    public static void main(String[] args){
	
	    Collection c=new ArrayList();
		
		//Iterator it=c.iterator();  //�������ȡ����������itָ����ǿյļ��ϣ����ڻ�ȡ��һ���յļ��Ͽ���
		                             //���������Ԫ�أ����ϵĽṹ�͸ı��ˣ�������û�иı䣬�����������it
								     //���е����Ǿͻ�����쳣��java.util.ConcurrentModificationException

		c.add(1);   //ע��˴���ӵ������ã�int i=1�Զ�װ���ˣ���Integer i=100;��Integer i=new Integer(1)
		c.add(2);
		c.add(3);
		c.add("���");
		c.add('A');
		c.add("����ϸ����");
        
		Iterator it=c.iterator();  //Ԫ��������֮���ٻ�ȡ��������������Ԫ�ض��ͺ����Ŀ��գ�
		                           //����ʹ��it.next()ʱ���Ͳ�����쳣��
		while (it.hasNext()){
            
			Object obj=it.next();
            
			//c.remove(1);         //���ﲻ�ɵ��ü���Collection�����remove�������Ƴ�Ԫ�أ���Ϊǰ�������
			                       //�Ѿ������ˣ����ϸı�Ԫ�أ��ṹ�ı��޷���Ӧ�õ�������������Ŀ�������
            
			//���������÷���:it.remove(),������it.next()������ִ�У����� IllegalStateException�쳣
			it.remove();           //���������У��Ƴ�Ԫ��ֻ�ܵ��õ������� remove()���������������ͬʱ�Ƴ�
			                       //�����е�Ԫ�غ͵���������������е�Ԫ�أ�ʵ����modCount��������һ�£�������쳣
			
			System.out.println(obj);  //�����Ƴ��󻹻��������ӡ�������Ϊobj�ǴӼ����ﷵ�صģ��������Ԫ��û�ˣ�
			                          //���س����ĸô�ӡ���Ǵ�ӡ����Ӱ��
		}

		int i=c.size();     //Ԫ�ظ���Ϊ0����Ϊ����whileѭ������it.remove()������ÿ����һ��Ԫ�ؾ������Ƴ��ˡ�
		System.out.println(i);
	}   

}