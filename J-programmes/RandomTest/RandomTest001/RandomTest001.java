import java.util.Random;

public class RandomTest001 {

    public static void main(String[] args){
	
	    Random rdm=new Random();   
		int k=rdm.nextInt();       //����int��Χ�ڵ������������ֵint����
		System.out.println(k);

		int h=rdm.nextInt(201);    //����0-200��Χ�ڵ������������0��������201.
		System.out.println(h);



	
	}

}