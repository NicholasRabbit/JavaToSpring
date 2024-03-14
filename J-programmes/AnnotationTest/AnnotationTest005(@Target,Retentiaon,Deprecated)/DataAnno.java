
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target({})  //It cannot be used to annotate anything directly.
@Retention(RetentionPolicy.SOURCE)
public @interface DataAnno{
	
}
