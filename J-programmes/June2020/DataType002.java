public class DataType002{
  public static void main(String[] args){
    byte m=(byte)198;
	

	System.out.println(m);  
	/*此处m输出数值为-58，前边198超出byte范围，|-58|=256-198，
	256模数，在模数范围内计算机中用负数绝对值补数代表负数，即用198代表-58

	*/
  
  }

}
