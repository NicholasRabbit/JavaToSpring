public class MyStacks02 {

    private int index;
	private Object[] element;

	public MyStacks02(){
	    
	}
	public MyStacks02(int k){
	    element=new Object[k];
		this.index=0;       //�˴����壺index=0����ʾջ֡û��ָ���κ�Ԫ�أ�index=1ʱ��ʾָ���һ��Ԫ��element[0]��������ָ��element[0]
		                    //��������ͽ����index���ܵ��±꣬Ҳ�ܵ�ջ֡�����⡣
	}

	
	public void push(Object obj) throws MyException003 {
	    if(index <element.length){
		    
			index++;                //index��0��Ϊ1��ָ��element[0]
			element[index-1]=obj;   //index������ָԪ���±��1
			
			

			return;
		}
		//�������Զ����쳣����ʾ��ջ����
		MyException003 me = new MyException003("ջ����");   //if����return��䣬��ִ�е�����˵��if��䲻��������ջ������
		throw me;
		
	}

	public void pop() throws MyException003 {
	    if ( !(element[0] instanceof Object) ){
			//�������Զ����쳣����ʾ��ջ�ѿ�
			MyException003 me = new MyException003("ջ�ѿ�");   
		    throw me;
		    
		}
		
		element[index-1]=null;   //index������ָԪ���±��1����ִ�е�����˵��if��䲻������
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