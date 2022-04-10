public class Customer001{
      private int score;

	  public void setScore(int m){
	      if(m<0|m>100){                       //此处防止有人输入负的分数，或大于100的分数，防止不合理情况输出。
		      System.out.println("输入错误!"); //保护被封装的数据安全。
			  return;
		  
		  }
		  score=m;
      
	  }

	  public int getScore(){
	     return score;
	  
	  }


}