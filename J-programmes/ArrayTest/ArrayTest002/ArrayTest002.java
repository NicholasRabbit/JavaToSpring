public class ArrayTest002 {

    public static void main(String[] args){
	     
		 //����̬��ʼ��������������Ĳ����
	     int[] num={10,20,50,40};
		 arrayMethod02(num);                      //��Ӵ���̬�����ʽ
         arrayMethod02(new int[] {10,20,50,40});  //Ҳ��������ֱ�Ӵ���ȥ��ע���new int[]��
         
         System.out.println("~~~~~~~~~~~~~~");
		
		 int[] no=new int[5];
	     arrayMethod02(no);           //��̬���鵱���������������
		 arrayMethod02(new int[5]);   //Ҳ����ֱ�Ӵ���ȥ�����Ĳ����
		 
		 System.out.println("~~~~~~~~~~~~~~");

		 
		 String[] strs={"abc","def","���"};          //��������String���ͣ�Ҳ���Դ������顣
		 arrayMethod01(strs);                         //������Ϊ���������÷�����                      

		 
  

	
	}

	public static void arrayMethod01(String[] a){    //�����β��б�Ϊ���飬����Ҳ������һ�����һ��������������ø�һ�㷽������һ����
	
	   for (int m=0;m<3;m++){
	   
	       System.out.println(a[m]);
	   }
		
	}

	
	public static void arrayMethod02(int[] b){
	
	    for (int i=0;i<b.length;i++){
		
		    System.out.println(b[i]);
		}
	}

}