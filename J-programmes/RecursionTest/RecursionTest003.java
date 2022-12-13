<<<<<<< HEAD
//使用递归计算阶乘
=======
>>>>>>> d3f476e7cbcdec68bc40a41731b9333532734208
public class RecursionTest003{
    public static void main(String[] args){
	    int q=multiple(1);
		System.out.println(q);
	
	}
	public static int multiple(int p){
	    if(p==5){
		   return 5;
		}
		return p*multiple(p+=1);        //此处不可用"p++"，可以用"p+=1"或"p+1"参照RecursionTest002内分析
	
	}

}