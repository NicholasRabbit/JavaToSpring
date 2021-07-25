import java.util.Random;

public class RandomTest001 {

    public static void main(String[] args){
	
	    Random rdm=new Random();   
		int k=rdm.nextInt();       //生成int范围内的随机数，返回值int类型
		System.out.println(k);

		int h=rdm.nextInt(201);    //生成0-200范围内的随机数，包括0，不包括201.
		System.out.println(h);



	
	}

}