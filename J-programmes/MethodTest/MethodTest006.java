public class MethodTest006{
    public static void main(String[] args){
	    MethodTest006.method01();
	
	
	}
	public static void method01(){
	    for(int a=1;a<10;a++){
		    if(a==5){ 
			  //break;       //break ֻ��ֹforѭ��
			  return;        //����ֵΪ��void,��return���,������������ֹ������
			}
		
		    System.out.println(a);
		} 
	    
		System.out.println("Hello"); 
	}


   
}