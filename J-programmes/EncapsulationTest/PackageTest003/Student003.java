public class Student003{
    
	private String name;
	private String gender;
    private	int age;
    
	public void setName(String n){
	     
		 name=n;
	
	}
	public String getName(){
	     
		 return name;
	
	}


	
	public void setGender(String g){           //���Ա��swich�������������ֹ�����������
	     switch(g){
		 case "boy": case "girl":
			 gender=g;
		     break;
         default:
			 System.out.println("����Ƿ���");
		 }
		 
	}
	public String getGender(){
	
	     return gender;
	}
	
	
	
	public void setAge(int a){              //�˴�a����ע����������(int)��Ҫ����,int a
	    if(a<0||a>100){
		    System.out.println("����������䲻�Ϸ�������������!");
			return;
		
		}
		
		age=a;
		
    }
	public int getAge(){
	
	    return age;
	}

}