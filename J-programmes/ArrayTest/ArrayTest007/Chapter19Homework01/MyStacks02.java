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

	
	public void push(Object obj){
	    if(index <element.length){
		    
			index++;                //index��0��Ϊ1��ָ��element[0]
			element[index-1]=obj;   //index������ָԪ���±��1
			
			for(int i=0;i<element.length;i++){
			    System.out.println(element[i]);  
			}

			return;
		}
		System.out.println("ջ����"); //ǰ��if��return��䣬�����ִ�е����˵��if��������
		
	}

	public void pop(){
	    if ( !(element[0] instanceof Object) ){
		    System.out.println("ջ�ѿ�");
			return;
		}
		
		element[index-1]=null;   //index������ָԪ���±��1����ִ�е�����˵��if��䲻������
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