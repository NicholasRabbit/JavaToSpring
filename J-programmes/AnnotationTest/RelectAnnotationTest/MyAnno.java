import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target({ ElementType.TYPE,ElementType.METHOD}) //��ʾMyAnnoע��ֻ�������࣬������
@Retention(RetentionPolicy.RUNTIME) //�ֺ�;����   //��ʾMyAnno���ע�ⱻ������class�ļ��У����Ա������ȡ
public @interface MyAnno {          //ע�������治�ӷֺ� ������

	String name();
}