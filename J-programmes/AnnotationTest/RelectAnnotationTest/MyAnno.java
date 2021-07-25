import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target({ ElementType.TYPE,ElementType.METHOD}) //表示MyAnno注解只能用于类，方法上
@Retention(RetentionPolicy.RUNTIME) //分号;不加   //表示MyAnno这个注解被编译在class文件中，可以被反射读取
public @interface MyAnno {          //注解语句后面不加分号 “；”

	String name();
}