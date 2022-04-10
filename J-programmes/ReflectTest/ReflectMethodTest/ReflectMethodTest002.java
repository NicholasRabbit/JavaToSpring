//��ReflectMethodTest001�Ļ����ϣ���ϰ���Է���Method[]����ķ���,������ȫ���ķ��� 
//���ַ�ʽ��getMethods();  getDeclaredMethods();   ע�������ַ�ʽ������
//���ַ�ʽ�õ���Ԫ�ط�����û��һ����˳�򣬼����ǰ���Դ�����е�˳���������

package com.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectMethodTest002 {

	public static void main(String[] args){
	
		Class c=null;
		
		try{
			c=Class.forName("com.javase.reflect.User");

			/* һ��getMethods()��ʽ
			   ��ȡһ����������public���εķ���,����һ���������,����User�Ӹ���Object�̳еķ���Ҳһ������
			   �˷�ʽ��ȡ�ķ�������û��˳���п��ܲ����մ��ϵ��µķ�ʽ������������
			   �ǹ���������protected,defalut,private���޷���ȡ
			*/
			Method[] methods=c.getMethods();   
			//����
			for(int i=0; i<methods.length; i++){
				//��ȡÿ�����������η�
				int modifiedNum=methods[i].getModifiers();
				String modifier=Modifier.toString(modifiedNum);
				
				//��ȡ����ֵ
				Class returnType=methods[i].getReturnType();   //��������з���Class<?>  getReturnType()
				String typeName=returnType.getSimpleName();

				//��ȡ������
				String methodsName=methods[i].getName();
				System.out.print(modifier+" "+typeName+" "+methodsName+" (");
				
				//��ȡ�β��б�����ֵ��һ��Class<?>[]���飬�з���
				Class[] parameterTypes=methods[i].getParameterTypes();
				
				//�����β��б�
				for(int j=0; j<parameterTypes.length; j++){
					String parameterName=parameterTypes[j].getSimpleName();
					System.out.print(parameterName+" ");
				}

				System.out.print(")\n");
				
				
			}

			/*����getDeclaredMethods();
				  �����������User�����������з���������public,protected,default,private�����������Ӹ����ӿڼ̳еķ���	
			*/
			System.out.println("\n�ָ���~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			Method[] declaredMethods=c.getDeclaredMethods();
			for(Method mm : declaredMethods){
				//��ȡ���η�
				int modifiedNum=mm.getModifiers();
				String modifiers=Modifier.toString(modifiedNum);
				//��ȡ����ֵ����
				Class  returnType=mm.getReturnType();
				String typeName=returnType.getSimpleName();
				//��ȡ������
				String methodName=mm.getName();
				
				System.out.print(modifiers+" "+typeName+" "+methodName+" (");  //���

				//��ȡ�β��б�  ����ֵ��һ��Class<?>[]���飬�з���
				Class[]  parameterTypes=mm.getParameterTypes();
				for(Class paraName : parameterTypes){
					String simpleName=paraName.getSimpleName();
					System.out.print(simpleName+" ");
				}
			    System.out.print(")\n");

			}

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SecurityException e){
			e.printStackTrace();
		}
	
	}


}