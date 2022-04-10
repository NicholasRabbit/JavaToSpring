public class MyStacks02 {

    private int index;
	private Object[] element;

	public MyStacks02(){
	    
	}
	public MyStacks02(int k){
	    element=new Object[k];
		this.index=0;       //此处定义：index=0，表示栈帧没有指向任何元素，index=1时表示指向第一个元素element[0]顶部，即指向element[0]
		                    //这样定义就解决了index既能当下标，也能当栈帧的问题。
	}

	
	public void push(Object obj) throws MyException003 {
	    if(index <element.length){
		    
			index++;                //index从0变为1，指向element[0]
			element[index-1]=obj;   //index比其所指元素下标大1
			
			

			return;
		}
		//这里用自定义异常来表示：栈已满
		MyException003 me = new MyException003("栈已满");   //if里有return语句，能执行到这里说明if语句不成立，即栈已满。
		throw me;
		
	}

	public void pop() throws MyException003 {
	    if ( !(element[0] instanceof Object) ){
			//这里用自定义异常来表示：栈已空
			MyException003 me = new MyException003("栈已空");   
		    throw me;
		    
		}
		
		element[index-1]=null;   //index比其所指元素下标大1，能执行到这里说明if语句不成立。
		index--;
		
	
	}
	
	
	
	
	public void setIndex(int index){
	    this.index=index;
	}
	public int getIndex(){
	    return index;
	}

	public void setElement(Object[] element){
	    this.element=element;
	}
	public Object[] getElement(){
	    return element;
	}

}