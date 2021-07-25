public class FinalizeTest001 {

    public static void main(String[] args){
	
	    

        for(int a=1;a<1000000000;a++){
		    Garbage g=new Garbage();
	            g=null;
		}
	}

}

class Garbage {

    protected void finalize() throws Throwable {
	
	    System.out.println("此为垃圾回收时机的执行方法");
	}


}