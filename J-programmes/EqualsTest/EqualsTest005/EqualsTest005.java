public class EqualsTest005 {

    public static void main(String[] args){
	    
		Address add1=new Address("�ӱ�ʡ","������","�����");
		Address add2=new Address("�ӱ�ʡ","������","�����");
		Address add3=new Address("�ӱ�ʡ","������","�ش�");

		Person p1=new Person("Tom",add1);
		Person p2=new Person("Tom",add2);
		Person p3=new Person("Tom",add3);

		boolean b1=p1.equals(p2);
		System.out.println("p1��p2�Ƿ�Ϊͬһ����:"+b1);

		boolean b2=p1.equals(p3);
		System.out.println("p1��p3�Ƿ�Ϊͬһ����:"+b2);



	
	}

}

class Person {

    private String  name;
	private Address  add;

	public Person(){
	
	}
	public Person(String name, Address add){
	    this.name=name;
		this.add=add;
	}

	public boolean equals(Object obj){
	    
		if(obj==null|!(obj instanceof Person)){
		    return false;
		}
		if(obj==this){
		    return true;
		}
		
		Person p=(Person)obj;
		if(this.name.equals(p.name)&this.add.equals(p.add)){      //Address���е�equals����Ҫ��д�����������жϵ��������ڴ��ַ��
		    return true;
		}
		
		return false;
	
	}

}


class Address {

    private String province;
	private String city;
	private String village;

	public Address(){
	
	}
	public Address(String province, String city, String village){
	    this.province=province;
		this.city=city;
		this.village=village;
	
	}

	public boolean equals(Object obj){
	    if(obj==null||!(obj instanceof Address))  return false;    //if����ֻ��һ�仰������ʡ�Դ����š�
		if(obj==this)   return true;

		Address a=(Address)obj;
		if(this.province.equals(a.province)&&this.city.equals(a.city)&&this.village.equals(a.village)){
		
		    return true;
		}
		return false;
	    
	}



}