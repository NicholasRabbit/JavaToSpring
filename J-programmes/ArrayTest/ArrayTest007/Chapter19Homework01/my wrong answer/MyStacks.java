//�����������

public class MyStacks {  

    private int index;    //int����ʵ��������Ĭ�ϳ�ʼֵΪ0
	private int posNO;    //posNO�������࣬û��Ҫ,ֻ��Ҫ�������������index=1ʱָ���±�Ϊ0��Ԫ�ض�������
	private Object[] element;

	public MyStacks(){
	
	}
	public MyStacks(int k){
	
	   element=new Object[k];
	}

	public void push(Object obj){
	
	    if(posNO < element.length){          //�˴���������posNOΪ0ʱ����������push()������
			element[posNO]=obj;
			index++;
			posNO=index-1;

			for(int i=0;i<element.length;i++){
			   System.out.println(element[i]);
		    }

			System.out.println("posNO"+posNO);

		}else{
		    System.out.println("ջ����");
		}
		
		
        
     }

	 public void pop(){
	 
	    if(element[0] instanceof Object){
		    element[posNO]=null;
			posNO--;
			index--;
		}else{
		    System.out.println("ջ�ѿ�");
		}

		for(int i=0;i<element.length;i++){
			System.out.println(element[i]);
		}

	 }

	 public void setIndex(int index){   //ÿ������˽�л�֮�󣬲����ò��õĵ�set,get��������Ҫд��ȥ����ҵ�淶,�����Ժ���ܻ��õ���
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