public class OperatorTest001{
  public static void main(String[] args){
      
	  
      int  a=100;
	  System.out.println(a++);   //���100  ϵͳ��int=x,a++����x��int=a++���ȸ�ֵ���㣬�����Լ�һ����
      System.out.println(a);      //���101
	  
	  
	  int  b=200;
	  int  m=b++;
	  System.out.println("m: "+m);    //m���ֵΪ200��m=b++��b�ȸ�ֵ��m�����Լ�һ������������b��201
	  System.out.println("b: "+b);

	  int  c=300;
	  //System.out.println(c++);    //�˴����300����Ϊϵͳ����int=c++
	  System.out.println(++c);


      
}



}