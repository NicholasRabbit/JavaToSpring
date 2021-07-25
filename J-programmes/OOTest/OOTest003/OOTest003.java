public class OOTest003
{
    public static void main(String[] args){
	    Husband yuQuan=new Husband();      //创建一个丈夫的对象，名字叫陈羽凡
		yuQuan.name="陈羽凡";

		
		Wife    baiHe=new Wife();          //创建一个妻子的对象，名字叫白百何
		baiHe.name="白百何";


		yuQuan.w=baiHe;     //这两行的作用是把两个对象关联起来，使得通过Husband可以知道到Wife,               
		baiHe.h=yuQuan;     //通过Wife也可以找到Husband。

		System.out.println("妻子名字: "+baiHe.name);     //此处没有关联 
		System.out.println("妻子名字: "+yuQuan.w.name);  //此处yuQuan.w.name就是通过Husband找的Wife

		System.out.println("丈夫名字: "+baiHe.h.name);   //此处通过妻子找到丈夫。
	
	
	}

}