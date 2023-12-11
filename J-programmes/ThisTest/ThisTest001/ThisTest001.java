public class ThisTest001{
    public static void main(String[] args){
	
		Athlete liuXiang=new Athlete();
		liuXiang.name="刘翔";
		liuXiang.running();     //实例方法调用：引用.方法名;

		Athlete yaoMing=new Athlete();
		yaoMing.name="姚明";
		yaoMing.running();
 
        //普通方法调用,类名.方法名
		Athlete.doThis();


	}


}
