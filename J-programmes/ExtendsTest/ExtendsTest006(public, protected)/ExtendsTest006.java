/*���า�Ǹ����еķ���������Ȩ���ǿ�����ȣ����Ը��ߣ����ܸ���
  �籾���и���doGet(..)����protected���εģ������п�����public���Σ����ǲ�����default���Σ���Ϊpublic > protected > default > private
*/

public class ExtendsTest006 {

	public static void main(String[] args){
		SuperClass sub=new SubClass();
		sub.doGet(10,20);
	}
}