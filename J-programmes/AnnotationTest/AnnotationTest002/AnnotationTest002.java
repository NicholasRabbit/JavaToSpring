/*Java�Դ�ע��Override�����÷��� 
Դ�룺 
@Target(value=METHOD)     =>˵��Override���ע��ֻ�����ڷ�����
@Retention(value=SOURCE)  =>����˵��Overrideע��ֻ������Դ���ļ��У������ᱻ����Ϊ.class�ļ�
public @interface Override{}

*/

public class AnnotationTest002 {

	//@Override
	public static void main(String[] args){
		System.out.println("Overrideע����ϰ");
	}

	@Override    //Overrideע��ֻ��ע��������д�ĸ��෽���ϣ��Լ�ʵ�ֽӿڵķ����ϵȣ����ܳ����ڲ�����д������������еķ����ϣ����򱨴�    
	public String toString(){
		return "AnnotationTest002";
	}

}