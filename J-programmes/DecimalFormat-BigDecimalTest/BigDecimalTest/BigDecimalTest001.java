import java.math.BigDecimal;

public class BigDecimalTest001 {

    public static void main(String[] args){
	
	   BigDecimal num1=new BigDecimal(100);   //�����100,500�Ǹ߾��ȵ����֣�������ͨ�Ļ�������
	   BigDecimal num2=new BigDecimal(500);
       System.out.println(num1);
	   System.out.println(num2);

	   //�ӷ����㣬������"+,-,*,/"����ѧ�����
	   BigDecimal num3=num1.add(num2);       //��͵���BigDecimal���ʵ������add(..)�������������˷�������������ֵ��Ȼ��BigDecimal�߾������͡�
	   System.out.println(num3);

	   BigDecimal num4=num1.subtract(num2);  //����������˳��Ϊ��num1-num2
       System.out.println(num4);             //�����-400
       
	   BigDecimal num5=num1.multiply(num2);  //�˷�
	   System.out.println(num5);

	   BigDecimal num6=num1.divide(num2);   //����������˳��Ϊ��num1/num2
	   System.out.println(num6);            //���0.2 
	   	
	
	}

}