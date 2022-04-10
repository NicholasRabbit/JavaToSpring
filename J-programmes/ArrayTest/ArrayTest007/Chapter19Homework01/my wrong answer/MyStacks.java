//个人做错的题

public class MyStacks {  

    private int index;    //int类型实例变量，默认初始值为0
	private int posNO;    //posNO变量多余，没必要,只需要搞清楚，并定义index=1时指向下标为0的元素顶部即可
	private Object[] element;

	public MyStacks(){
	
	}
	public MyStacks(int k){
	
	   element=new Object[k];
	}

	public void push(Object obj){
	
	    if(posNO < element.length){          //此处代码有误，posNO为0时调用了两次push()方法。
			element[posNO]=obj;
			index++;
			posNO=index-1;

			for(int i=0;i<element.length;i++){
			   System.out.println(element[i]);
		    }

			System.out.println("posNO"+posNO);

		}else{
		    System.out.println("栈已满");
		}
		
		
        
     }

	 public void pop(){
	 
	    if(element[0] instanceof Object){
		    element[posNO]=null;
			posNO--;
			index--;
		}else{
		    System.out.println("栈已空");
		}

		for(int i=0;i<element.length;i++){
			System.out.println(element[i]);
		}

	 }

	 public void setIndex(int index){   //每个属性私有化之后，不管用不用的到set,get方法，都要写上去，行业规范,而且以后可能会用到。
	     this.index=index;
	 }
	 public int getIndex(){
	    return index;
	 }
	 
	 public void setPosNO(int posNO){
	    this.posNO=posNO;
	 }
	 public int getPosNO(){
	    return posNO;
	 }



}