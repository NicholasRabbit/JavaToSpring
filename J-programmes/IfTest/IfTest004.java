public class IfTest004{
    public static void main(String[] args){
       java.util.Scanner scan=new java.util.Scanner(System.in);
       System.out.print("������ߣ�");   
       double  height=scan.nextDouble();
       
       String   nutritionalGrade="����";
       
       if (height>=170&&height<=185) {
          nutritionalGrade="����";
      }else if (height<170 && height>=150) {
          nutritionalGrade="һ��";
      }else if (height<150) {
          nutritionalGrade="��������";
      }else {
          nutritionalGrade="���ݴ�������쳣��";
      }
	   System.out.println("��������״��Ϊ: "+nutritionalGrade);          //ע��������String���ݲ�Ҫ���Ǳ�д
       
     
      


    }


}