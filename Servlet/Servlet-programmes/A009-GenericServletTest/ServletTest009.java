import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletConfig;

import java.io.IOException;

public class ServletTest009 extends GenericServletTest {

	//继承GenericServletTest适配器后，只需重写service(..)方法即可，别的方法用的到再覆盖重写
	//代码简洁了
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("子类service()方法执行");
	}

	public void init(){
		System.out.println("子类重写无参init()方法，只执行一次");
	}
}