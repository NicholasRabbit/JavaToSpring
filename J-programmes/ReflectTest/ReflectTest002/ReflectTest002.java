public class ReflectTest002 {

	public static void main(String[] args){
	
		try{
		   
		   /* forName(..)�����ڲ��������Ǿ���·�����ǰ���+����,����User���ڱ�����ͬĿ¼�£�����û�а���
		      һ��cmd����srcĿ¼�´����У������User�������package com.javse.reflect;��ôUser.class�ͻ�
			  ��javac -d . *.java������../src/com/javase/reflectĿ¼�£�Ȼ��������������:com.javse.reflect
		   */
		   Class c=Class.forName("User");  
		   
		   /*newInstance()�������ص���Object����,�ײ������User��������޲ι��췽��,���Userû���޲ι��췽��
		     ����׳�IllegalAccessException�쳣
		     ��������Ǹ����ͷ���
		   */
		   User u=(User)c.newInstance();  //������趨���ͣ����ص���һ��Object   
		   System.out.println(u);          

		}catch(ClassNotFoundException | InstantiationException  | IllegalAccessException e){
		   e.printStackTrace();  //catch�����Զ���쳣һ��׽��ע��д����ֻ��һ������:e
		}

		//System.out.println(obj);  try{}��ı������ﲶ׽������sout���Ӧд��try{}��������

		
		
	}

}