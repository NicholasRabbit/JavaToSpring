public class IfTest002{
    public static void main(String[] args){
        double  m=70;
        if(m>90&m<=100){                   //ע���߼���&���÷����˴��ö�·��&&���������Ч��
			System.out.println('A');       //�ɼ�����90С�ڵ���100
		}else if(m>80&m<=90){              //�ɼ�����80С�ڵ���90
			System.out.println('B');
		}else if(m>60&m<=80){              //60<m<=80
			System.out.println('C');  
		}else if(m<60&m>=0){               //m<60
			System.out.println('D');
		}else /*if(m<0|m>100)*/{           //����ע���ڿɼӿɲ��ӣ�Ч��һ��
		    System.out.println("�������������������Ƿ���ȷ��");
		}   

         m=50;
		String  level="A";              //���ϳ�����д���������ַ�������
        if(m>90&m<=100){                  
			level="A";       
		}else if(m>80&m<=90){              
			level="B";
		}else if(m>60&m<=80){              
			level="C";  
		}else if(m<60&m>=0){               
			level="D";
		}else /*if(m<0|m>100)*/{           
		    level="�������������������Ƿ���ȷ��";
		}
		System.out.println(level);      //ע�����Ҫ���Ǵ������"level"���
 



  }
}