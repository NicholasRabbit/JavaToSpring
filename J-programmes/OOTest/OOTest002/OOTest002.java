public class OOTest002{
    public static void main(String[] args){
	   
	   Citizen002 c=new Citizen002();      //编译时，OOTest002里有引用Citizen002的语句，而Citizen002里有引用Address002的语句，
                                           //因此，只需编译，OOTest002即可，后面的会自动编译生成class文件
	   int m=c.no;

	   int n=c.age;

	   System.out.println(m);
	   System.out.println(n);
	   System.out.println(c.addr);

	   c.no=150;
	   c.age=25;
	   c.name="Tom Hanks";
	   c.addr=new Address002();
	   //c.addr="待定";                //addr为后面Address002声明变量，无法直接赋值。

	   System.out.println(c.no);
	   System.out.println(c.age);
	   System.out.println(c.name);

	   //System.out.println(c.addr);


	   //java中可以连续引用

	   String  p=c.addr.province;
	   String  q=c.addr.city;
	   String  r=c.addr.county;
	   int     s=c.addr.streetNo;

	   System.out.println(p);
	   System.out.println(q);
	   System.out.println(r);
	   System.out.println(s);
	   System.out.println("分割线~~~~~~~~~~~~~~~~~~~~~");

	   //连续引用赋值；
	   c.name="Robert Browning";
	   c.addr.province="河北省";
	   c.addr.city="邯郸市";
	   c.addr.county="大名县";
	   c.addr.streetNo=110;
	   System.out.println(c.name+"的地址:"+c.addr.province+c.addr.city+c.addr.county+c.addr.streetNo);





	
	
	}



}