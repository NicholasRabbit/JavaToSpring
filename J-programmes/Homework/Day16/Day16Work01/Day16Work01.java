public class Day16Work01 {

    public static void main(String[] args){
	    A a=new A(100);
		B b=new B(a);
		  

        java.util.Scanner scan=new java.util.Scanner(System.in);
		
		while(true){
		   System.out.print("������²����֣�");
		   int num=scan.nextInt();
		   b.compare(num);
		}
		 
	}

}

class A {

    private int v;

	public A(){
	
	}

	public A(int v){
	
	   this.v=v;
	}

	public void setA(int v){
	
	   this.v=v;
	}

	public int getA(){
	
	   return v;
	}


}

class B {

    A a;      //�˴�����һ��class A���͵ı���a,Ŀ����Ϊ�˰�������´����Ķ���a�ĵ�ַ��������Ȼ����a.getA()����A������v��ֵ�����Ƚ�

	public B(){
	  System.out.println(a);
	}
	public B(A a){
	
	   this.a=a;
	   
	}
    
	//int vNum=a.getA();   //��ָ���쳣,a�ǿյģ����������ԣ�û��ʵ��������û�д�������,�����aû�б����ã��������κζ������Ϊ�ա�
	                       //����ʱ������ֵ����˱���ʱaΪnull��ִ��main����ʱcompare()�����ô��У��������ʱ�Ϳ�ָ���쳣����
    public void compare(int num){
	    int vNum=a.getA();       //ִ��main����ʱ���ã�ִ�д��У���ʱ��a�ĵ�ַ��ֵ����            
	    if(num==vNum){
		
		    System.out.println("���");
			      
			//return;             //�˴��¶��Ժ���returnֻ����ֹ����ִ�У���while�����һֱ���ظ����ã�����return������û����
		    System.exit(0);       //���д����ʾֱ����ֹJVM���С�

		}else if(num>vNum){
		
		    System.out.println("����");
		}else{
		
		    System.out.println("С��");
		}

	}


}