import java.math.BigDecimal;

public class BigDecimalTest001 {

    public static void main(String[] args){
	
	   BigDecimal num1=new BigDecimal(100);   //这里的100,500是高精度的数字，不是普通的基本数据
	   BigDecimal num2=new BigDecimal(500);
       System.out.println(num1);
	   System.out.println(num2);

	   //加法运算，不能用"+,-,*,/"等数学运算符
	   BigDecimal num3=num1.add(num2);       //求和调用BigDecimal里的实例方法add(..)，其它减法，乘法，除法，返回值仍然是BigDecimal高精度类型。
	   System.out.println(num3);

	   BigDecimal num4=num1.subtract(num2);  //减法，运算顺序为：num1-num2
       System.out.println(num4);             //结果：-400
       
	   BigDecimal num5=num1.multiply(num2);  //乘法
	   System.out.println(num5);

	   BigDecimal num6=num1.divide(num2);   //除法，运算顺序为：num1/num2
	   System.out.println(num6);            //结果0.2 
	   	
	
	}

}