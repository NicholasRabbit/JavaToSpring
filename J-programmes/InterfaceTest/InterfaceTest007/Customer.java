public class Customer {

    private Bicycle bikeMake;  //Ħ�г��ͺš�ע������һ����Ҳ����һ���������͵�˼�룬���Һ�purchase()������ϵ���ʹ�á�

	public Customer(){
	
	}

	public Customer(Bicycle bikeMake){        //�˴�����Test���ﴫ�������ڴ��ַ���Թ��·�purchase()����ʹ�ã������ø��������make()������
	
	    this.bikeMake=bikeMake;
	}
    
	//set&get������
    public void setBikeMake(Bicycle bikeMake){
	
	   this.bikeMake=bikeMake;
	}
	public Bicycle getBikeMake(){     //����ֵ����Ҳ��Bicycle,���retrun bikeMake;
	
	   return bikeMake;
	}

	public void purchase(){
	
	    bikeMake.make();      //this.bikeMake.make()ʡ����ʽ��this.�ڴ�ʡ���ˡ�
	}

}