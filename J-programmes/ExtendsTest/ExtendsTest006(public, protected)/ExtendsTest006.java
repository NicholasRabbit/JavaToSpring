/*子类覆盖父类中的方法，访问权限是可以相等，可以更高，不能更低
  如本例中父类doGet(..)是由protected修饰的，子类中可以由public修饰，但是不能由default修饰，因为public > protected > default > private
*/

public class ExtendsTest006 {

	public static void main(String[] args){
		SuperClass sub=new SubClass();
		sub.doGet(10,20);
	}
}