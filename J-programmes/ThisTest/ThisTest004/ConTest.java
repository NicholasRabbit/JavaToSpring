public class ConTest{
    
	public static void main(String[] args){    //ϰ����ϰ��ԭ���ppt�ʼ�
	     
		 ConTest.method1();
		         method1();
 
         ConTest m2=new ConTest();
		         m2.method2();

	
	}
	
	int i=10;

	public static void method1(){
	    ConTest.doSome();              
		        doSome();

        ConTest d1=new ConTest();
		        d1.doOther();
         
		ConTest iVisit=new ConTest();
		        //iVisit.i;                     //�˴�ֻдiVisit.iΪʲô���У�ԭ��iVisit.i�ǵ�����һ�����ԣ����ܵ����ɾ䣬���Ե����Ⱥ��ұ߸�ֵ�����ߵ���ʵ�εȡ�
				System.out.println(iVisit.i);   
	
	}
	public void method2(){
	    ConTest.doSome();     //�����ǵ���ConTest��ķ���,������.��������
		        
				doSome();     //�����ǵ���ConTest�����doSome����ʡ�Ե��ǵ�ǰ�������������,��������
                              //��this.doSome();��Ϊ������.������Ҳ���Ե���static��������ʹ����Ϊnull��
							  //����д����"ConTest c=new ConTest(); c=null(cΪ��Ҳ����); c.doSome();��this.doSome;"
							  //��������c��Ч�������ˣ�SUN�ڲ������Ͽɣ�
        this.doOther();
		     doOther();

             System.out.println(this.i);

        
	
	}

	public static void doSome(){
	
	    System.out.println("doSome�������");
	}

	public void doOther(){
	
	    System.out.println("doOther�������");
	}
	

}
