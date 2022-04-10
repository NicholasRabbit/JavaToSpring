/*元注解：用于注解上的注解，称为元注解，以下是常用的两个元注解

(1)Target({ElementType.Method}}) 后面括号内表示一个注解只能用于方法上

(2)Retention（RetentionPolicy.Class）后面属性的的含义
CLASS  编译器将把注释记录在类文件中，但在运行时 VM 不需要保留注释。 
RUNTIME 编译器将把注释记录在类文件中，在运行时 VM 将保留注释，因此可以反射性地读取。 
SOURCE  编译时注解保留在源文件中，不编译
*/

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnno {

        

}