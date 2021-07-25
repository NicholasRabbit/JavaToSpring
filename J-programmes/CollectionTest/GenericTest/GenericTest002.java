import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class GenericTest002 {

    public static void main(String[] args){
	
	   List<Automobile> myList=new ArrayList<>();   //����ļ����ſ���ʲôҲ��д��jdk8�Ժ�ֻҪǰ��Listд�˷��� 
	                                                //��ô������ľ��Զ��жϷ��͡�
													//����������治�Ӽ����ţ�����ֱ�����Ϣ,����Ӱ������
	                                                //"ע: GenericTest002.javaʹ����δ�����򲻰�ȫ�Ĳ�����"
       
      
	   Automobile  b=new Saloon();
	   Automobile  c=new Pickup();
	 
	   myList.add(b);
	   myList.add(c);

	   Iterator<Automobile>  it=myList.iterator();

	   while(it.hasNext()){
	       Automobile auto=it.next();
		   if(auto instanceof Saloon){
		      auto.move();
			  
			  //auto.saloonGas();      //���б��������£���̬���õ����������з������������ض�̬�﷨��������ת��
			  Saloon s=(Saloon)auto;
			  s.saloonGas();
		   }else if(auto instanceof Pickup){
		      
			  auto.move();
			  
			  Pickup p=(Pickup)auto;
			  p.pickupGas();
		   }
       }                                             
         	
	}                                     

}

class Automobile {

    public void move(){
	    System.out.println("���������ƶ�");
	}
}

class Saloon extends Automobile {

    public void move(){
	
	    System.out.println("�γ��ڿ���");
	}

	public void saloonGas(){
	    System.out.println("�γ��ڼ���");
	}

}

class Pickup extends Automobile {

    public void move(){
	    System.out.println("Ƥ����ǰ��");
	}

	public void pickupGas(){
	    System.out.println("Ƥ���ڼ���");
	}

}