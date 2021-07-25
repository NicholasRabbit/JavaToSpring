public class InterfaceTest001 {

    public static void main(String[] args){
	
	    //User00 u=new User00();     //接口属于抽象类的一种，不可实例化，此行报错。
		//       u.NUMBER;          
		System.out.println("接口常量输出： "+User00.NUMBER);   //调用接口内常量直接用：类名.常量名；       
	}

}


interface User00{                        //interface前面可加public等在新建的另外文件里，只不过这里为了方便观看，写在同一文件内
    
	public static final int NUMBER=100;  //接口中所有元素都是public修饰，都是公开的。
	
	public abstract int method01(int a,int b);

	
	String	COUNTRY_NAME="中国";       //常量前的public static final可以省略，抽象方法前的public abstract也可以省略
    int method02(int a,int b);         //因为接口里只有常量和抽象方法，因此省略了系统也默认给加。
 
}

interface User01 extends User00 {

}

interface User02 extends User00,User01 {    //接口支持多继承。

}
