public class StringMethod202 {

    public static void main(String[] args){
	
	    String s1=new String("abc");
		System.out.println(s1);        

		byte bytes[] = {66,67,70,68,99};     
		String s2=new String(bytes);
		System.out.println(s2);


		String s3=new String(bytes,0,3);    //String����һ���Դ����췽������byte����������֡� 
		System.out.println(s3);             //�����BCF

		


	
	}

}