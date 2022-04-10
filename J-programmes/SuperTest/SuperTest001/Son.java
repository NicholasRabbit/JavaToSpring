public class Son extends Father {

    String name="Son";
	
	public void work(){
	
	   System.out.println("儿子在工作");
	}

	public void methodOfSon(){
	
	   System.out.println(this.name);   //这里this.name调用子类里的name，结果“Son”。
	   this.work();                     //调用子类里的方法work()，输出“儿子在工作”。
       
	   System.out.println("分割线~~~~~~~~~~~~~~~");
	   
	   //super的作用，强制调用父类里的name，work(),即使子类（本类）里有name也不调用。
	   System.out.println(super.name);   
	   super.work();                     


	}

}