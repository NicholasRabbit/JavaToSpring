public class StaticTest001{

    public static void main(String[] args){
	
	     Human001 tom=new Human001();
		          tom.id=130555;
				  tom.name="Tom";
				  System.out.println(tom.id+","+tom.name+","+Human001.country); //这里对象tom和jerry的国籍相同，因此定义为static变量,用类名，变量名调用

      
	     Human001 jerry=new Human001();
		          jerry.id=130666;
				  jerry.name="Jerry";
                  System.out.println(jerry.id+","+jerry.name+","+Human001.country);

	}
}