/*Ԫע�⣺����ע���ϵ�ע�⣬��ΪԪע�⣬�����ǳ��õ�����Ԫע��

(1)Target({ElementType.Method}}) ���������ڱ�ʾһ��ע��ֻ�����ڷ�����

(2)Retention��RetentionPolicy.Class���������Եĵĺ���
CLASS  ����������ע�ͼ�¼�����ļ��У���������ʱ VM ����Ҫ����ע�͡� 
RUNTIME ����������ע�ͼ�¼�����ļ��У�������ʱ VM ������ע�ͣ���˿��Է����Եض�ȡ�� 
SOURCE  ����ʱע�Ᵽ����Դ�ļ��У�������
*/

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnno {

        

}