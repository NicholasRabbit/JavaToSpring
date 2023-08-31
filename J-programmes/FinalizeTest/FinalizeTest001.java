public class FinalizeTest001 {

    public static void main(String[] args){
		//测试垃圾回收时自动调用的finalize()方法
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
