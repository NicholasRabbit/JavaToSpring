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

	
	public void push(Object obj){
	    if(index <element.length){
		    
			index++;                //index从0变为1，指向element[0]
			element[index-1]=obj;   //index比其所指元素下标大1
			
			for(int i=0;i<element.length;i++){
			    System.out.println(element[i]);  
			}

			return;
		}
		System.out.println("栈已满"); //前面if有return语句，如果能执行到这里，说明if不成立。
		
	}

	public void pop(){
	    if ( !(element[0] instanceof Object) ){
		    System.out.println("栈已空");
			return;
		}
		
		element[index-1]=null;   //index比其所指元素下标大1，能执行到这里说明if语句不成立。
		index--;
		for(int i=0;i<element.length;i++){
		    System.out.println(element[i]);  
	    }
	
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