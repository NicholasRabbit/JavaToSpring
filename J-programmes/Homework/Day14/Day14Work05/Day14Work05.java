public class Day14Work05 {

    public static void main(String[] args){
	
	    Husband tom=new Husband();
		        tom.name="����";
 
        Wife jenny=new Wife();
		     jenny.name="Jenny";

			 tom.wife=jenny;      //���ɷ����ӹ�������,�����������޵�ַ���������Ϊ��ָ���쳣��
			 jenny.husband=tom;

        System.out.println("jenny�ɷ�����֣�"+jenny.husband.name);
		System.out.println("tom���ӵ����֣� "+tom.wife.name);
	
	}

}