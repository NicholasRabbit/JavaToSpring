public class IfTest003{
   public static void main(String[] args){
   
   java.util.Scanner scan=new java.util.Scanner(System.in);
   System.out.print("����ɼ�:");
   double score=scan.nextDouble();    //�˴�ִ����Ϻ�ȴ��������룻 
                                      //����൱�ڰѳ����������������ˣ�
   String level="�е�";               //��������ݸ�������if��䣬�����жϣ�
                                      //�Ӷ�������ͬ�Ľ��
   
   
   if(score<=100&score>90){
      level="�ŵ�";  
   }else if(score<=90&score>70){
      level="�е�";
   }else if(score<=70&score>=60){
      level="һ��";
   }else{
      level="��ӱ�Ŭ��";
   } 
   System.out.println(level);
   
   
   
   }

}