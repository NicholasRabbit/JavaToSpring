public class WhileTest002 {

    public static void main(String[] args){
	
	    WhileTest002.saveMoney01(10);
		            saveMoney02();
					saveMoney03();
	
	}

	public static int saveMoney01(int a){    //��ϰ��ʽ�����б����������塣
	    
		float k=0f;
		
		for(int n=1;;n++){
		
		    
			if(n%5==0){
			
			   k=k+6f;
			}
			if((2.5*n-k)>=100f){
			
			   System.out.println(n+"�����"+(2.5*n-k)+"Ԫ");
			   break;
			}
		
		}
		return a;  //��ϰ����ֵ�����������塣
	}


	//������while���д��

	public static void saveMoney02(){
	
	    int day=0;
		double money=0.0;

        while(true){
		    
			day++;
			money+=2.5;
            
			if(day%5==0){
			
			   money-=6.0;
			}
			if(money>=100.0){
			
			    System.out.println("while�������������"+day);
			    break;
			}

		}

	}

	//����while���Ż�д����
	public static void saveMoney03(){
	    int day=0;
		double money=0.0;
	    while(money<100.0){       //�˴���money��ֵ����100ʱ���Ͳ�ִ���ˣ�����Sout�������
		    day++;
			money+=2.5;
			if(day%5==0){
			
			    money-=6.0;
			}
		}

		System.out.println("while�Ż���������������"+day);
	}

}