public class MethodTest006{
    public static void main(String[] args){
	    MethodTest006.method01();
	
	
	}
	public static void method01(){
	    for(int a=1;a<10;a++){
		    if(a==5){ 
			  //break;       //break 只终止for循环
			  return;        //返回值为空void,用return语句,起到整个方法终止的作用
			}
		
		    System.out.println(a);
		} 
	    
		System.out.println("Hello"); 
	}


   
}