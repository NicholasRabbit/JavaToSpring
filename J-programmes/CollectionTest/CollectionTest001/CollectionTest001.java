import java.util.Collection;
import java.util.ArrayList;

/*
���뱨����Ϣ������Ӱ������
��ע: CollectionTest001.javaʹ����δ�����򲻰�ȫ�Ĳ�
ע: �й���ϸ��Ϣ, ��ʹ�� -Xlint:unchecked ���±��롣��

ԭ��jdk1.5�汾�Ժ󣬼����ഴ�������˷���:<E>�����ǶԼ�����Ԫ�ص������趨���м�飬��Ҫָ���������ͣ�����ָ��String ,int������
ָ�������Ժ��﷨:  Collection <String> c = new ArrayList <String> ();ֻ�����String���ͣ������ɱ����Ժ�����c����ʵ���෽����������ת�ͣ���������ʱ
�쳣������ClassCastException�ȵĳ���

���˷����Ժ�

    ������Ӽ�ࡾ����ǿ��ת����
	������ӽ�׳��ֻҪ����ʱ��û�о��棬��ô����ʱ�ھͲ������ClassCastException�쳣��
	�ɶ��Ժ��ȶ��ԡ��ڱ�д���ϵ�ʱ�򣬾��޶������͡�



*/

public class CollectionTest001 {

    public static void main(String args[]){
	
	    collectionMethod();
	}

	public static void collectionMethod(){
	
	    Collection  c=new ArrayList();   //Collection��һ���ӿڣ����ڳ����࣬����new����ֻ��ʹ�ö�̬�﷨��
		//����ɹ涨�÷���,�����������Ͳ��ᱨ���ˡ����£�
		//Collection <String> c = new ArrayList <String> ();

		c.add("���");     //Collection���add()������ϰ������ֵ�������ͣ����ʱ���ظ���Ԫ���򷵻�false
		c.add("����");     //add(..)�����Զ���Ԫ�ؼӵ�������ĩβ
		
		c.add(123);      //����涨�÷��ͣ�������String��ô��ӱ�������������쳣��
		c.add(0.5f);
		c.add(true);  
		

		int a=c.size();   //��鼯����Ԫ�ظ���������ֵint���͡�
		System.out.println(a);

		boolean b=c.contains(123);  //Collection���contains��������֤�Ƿ���ĳ��Ԫ�أ�����ֵ�������͡�
		boolean b2=c.contains("��ò���");
		System.out.println("b: "+b+" b2:"+b2);

		Object[]  objArray=c.toArray();  //�Ѽ����ж�����Object�����������ʽ����
		for(int i=0;i<objArray.length; i++){
		    Object o=objArray[i];
			System.out.println("Object���������"+o);
		}

		c.remove(123);    //�Ƴ�Ԫ�ط���remove(ʵ��);
		System.out.println("Ԫ�ظ���:"+c.size());

		c.clear();   //���ȫ��Ԫ��
		System.out.println("Ԫ�ظ���:"+c.size());   

		boolean b3=c.isEmpty();  //��鼯���Ƿ�Ϊ�գ����򷵻�true
		System.out.println(b3);

		
	
	}
    

}


class User {

}