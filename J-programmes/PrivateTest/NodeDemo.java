
/*
* 研究私有属性
* 1，如果一个类中有一个"自己本身"的私有属性，则可以使用this.field.field的方式访问该属性对象私有属性
* 例：NodeDemo中的number是私有属性，则在本类中可以使用this.node.number的方式访问node的私有属性
* 但是在别的类中不可以，见User.java。
* 2，在子类中也不可以用super.xxx的形式访问父类的私有属性。
*/
public class NodeDemo {

	//属性私有化
	private int number;
	//设置一个属性为自己的类型
	private NodeDemo node;

	public NodeDemo(){
	
	}
	public NodeDemo(int number){
		this.number = number;
	}

	
	public int getPrivateNum(NodeDemo node){
		this.node = node;
		return this.node.number;   //这里不报错。
	}
	
}
