public class CaculationTest001{
    public static void main(String[] args){
	    java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.print("��n�������ۼ�֮����� ");
        int n=scan.nextInt();
		int m=(n+1)*n/2;
		System.out.println(m);

		System.out.print("��һ��x���ۼ��㷨��forѭ��,����x�� ");
		int x=scan.nextInt();
		int sum=0;                //�˴�int sum���븳��ʼֵ����������sum+=x�ᱨ��
		for(x=1;x<=100;x+=1){
		    sum+=x;
		}
        System.out.println(sum);

	}


}