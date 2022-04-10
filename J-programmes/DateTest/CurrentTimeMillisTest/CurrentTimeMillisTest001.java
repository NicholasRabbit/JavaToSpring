public class CurrentTimeMillisTest001 {

    public static void main(String[] args){
	
	    long begin=System.currentTimeMillis();    //System类里静态方法currentTimeMillis,计算从1970-1-1 0:00.000到当前执行时的毫秒数
		System.out.println(begin);                //开始时间
		
		long proceedingTime=method(begin);
		System.out.println(proceedingTime);       //用途，本例计算for循环完毕所需时间
	}

	public static long method(long begin){
	
	    for(int a=0;a<1000000;a++){
		    
		}
	    
		long finish=System.currentTimeMillis();
		System.out.println(finish);              //结束时间
		
		return finish-begin;
	}

}