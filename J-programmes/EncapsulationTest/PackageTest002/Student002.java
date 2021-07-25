public class Student002{
    
	private int score;

	public void setScore(int a){
	    
		if (a<0|a>100){
		    
			System.out.println("输入数据不合法，请检查！");
		    return;
		}

		score=a;
	}

	public int getScore(){
	    
		return score;
	
	}


}