public class CurrentTimeMillisTest002 {

    public static void main(String[] args){
	
       long now=System.currentTimeMillis();
	   System.out.println(now);

	   long monthAgo=now-1000*60*60*24*30;  //计算一个月前的毫秒数
	   System.out.println(monthAgo);
	
	}

}