public class SwitchTest003{
    public static void main(String[] args){
			java.util.Scanner s=new java.util.Scanner(System.in);
			
			System.out.print("�������һ�����֣�");
			int number01=s.nextInt();
			
			System.out.print("���������㷽����");
			String operator=s.next();
			
			System.out.print("������ڶ������֣�");
			int number02=s.nextInt();

			int result=0;   //���⸳ֵ������ֵ����������Sysrem.out������resultû��ֵ,
                            //�мӺ�Ҳ���ַ����������������ͣ���˻ᱨ��
			switch(operator){
			   case "+":
			   result=number01+number02;
			   break;

			   case "-":
			   result=number01-number02;
			   break;

			   case "*":
               result=number01*number02;
			   break;

			   case "/":
               result=number01/number02;
			   break;

			   case "%":
               result=number01%number02;
			   break;
			   default:
				   System.out.println("�������");

			


			}
			
			System.out.println(number01+operator+number02+'='+result);
			//ע�⣬result�Ľ������������������ģ������+���Ѿ�������ַ������ӷ�
			//���е���Ϊ��'='���ַ������ӷ�+����������ַ���
			//������������case�б��ʽ������ģ�����д������ֻ��Ϊ����ʾ��10+20=30�����ʽ

	      
	}

}

