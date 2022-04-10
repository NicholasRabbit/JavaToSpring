public class Day14Work05 {

    public static void main(String[] args){
	
	    Husband tom=new Husband();
		        tom.name="阿甘";
 
        Wife jenny=new Wife();
		     jenny.name="Jenny";

			 tom.wife=jenny;      //把丈夫妻子关联起来,否则引用里无地址，下面输出为空指针异常。
			 jenny.husband=tom;

        System.out.println("jenny丈夫的名字："+jenny.husband.name);
		System.out.println("tom妻子的名字： "+tom.wife.name);
	
	}

}