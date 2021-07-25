public class FinallyTest003 {

    public static void main(String[] args){
	
	    int retValue=method();
		System.out.println(retValue);   //此处输出100，即return i;返回值为100，不是101， 
	}                                   //java中有两条重要规则；1，方法体内的程序遵循自上而下执行的规则；2，return语句执行，方法必须结束。
                                        //此处不违背这两条规则。
	public static int method(){
	
	    int i=100;
		try{
		    return i;    
		}finally{
		    i++;
		}
	
	}

}