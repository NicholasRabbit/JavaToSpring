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


	
	public void setGender(String g){           //把性别和swich语句结合起来，防止输入参数错误。
	     switch(g){
		 case "boy": case "girl":
			 gender=g;
		     break;
         default:
			 System.out.println("输入非法！");
		 }
		 
	}
	public String getGender(){
	
	     return gender;
	}
	
	
	
	public void setAge(int a){              //此处a变量注意声明类型(int)不要忘记,int a
	    if(a<0||a>100){
		    System.out.println("您输入的年龄不合法，请重新输入!");
			return;
		
		}
		
		age=a;
		
    }
	public int getAge(){
	
	    return age;
	}

}