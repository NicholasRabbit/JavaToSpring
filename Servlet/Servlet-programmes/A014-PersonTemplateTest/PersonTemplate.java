/*模板方法设计模式范例，模板方法属于23中设计模式之一
  仅研究上个案例A011中使用的HttpServlet模板方法，不部署服务器
*/

public abstract class PersonTemplate{

	/*final修饰的方法可以被继承，不可被重写
	  因此方法体里面m1~m3的执行顺序是定好的，也可看做是算法是定好的，子类必须按照此模板类的顺序执行
	*/
	public final void templateMethod(){  
			m1();
			m2();
			m3();
	}

	//抽象类，用来被重写
	public abstract void m1();   //抽象类一定出现在抽象方法中，或接口中，因此上面class不要忘记加abstract 修饰

	public abstract void m2();

	public abstract void m3();


}