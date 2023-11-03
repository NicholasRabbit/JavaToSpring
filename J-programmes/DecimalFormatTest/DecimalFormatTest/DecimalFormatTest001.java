import java.text.DecimalFormat;

public class DecimalFormatTest001{

    public static void main(String[] args){
	
	    DecimalFormat df=new DecimalFormat("###,###.##");  //#�����������֣�ֻ����#����ķ��Ų��У����ﴴ�����󣬲��趨���ָ�ʽ���вι��������String���͡�
		String stNum=df.format(654321);                    //DecimalFormat�����format()������������ת��Ϊ�趨�ĸ�ʽ������ֵString���͡�
		System.out.println(stNum);                         //654,321

		
		DecimalFormat df2=new DecimalFormat("###,###.0000");
		
		String stNum2=df2.format(654321);               //�����654,321.0000
		System.out.println(stNum2);

		String stNum3=df2.format(654321.56);
		System.out.println(stNum3);                     //�����654,321.5600

        String stNum4=df2.format(654321.56467);
		System.out.println(stNum4);                     //���ո������ȣ��������룬�����654,321.5647         
		
	}

}