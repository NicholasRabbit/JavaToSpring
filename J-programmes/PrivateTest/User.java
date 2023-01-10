
/*
* 在这里就不可以用node.number的形式直接访问私有属性number
*/
public class User {
	
	private NodeDemo node;

	public User(){
	
	}
	public User(NodeDemo node){
		this.node = node;
		
	}

	public int getNum(){
		return this.node.number;   //这里就报错： 错误: number可以在NodeDemo中访问private
	}

}