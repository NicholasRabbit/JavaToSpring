public class OOTest004{
    public static void main(String[] args){
	   Pointer p=new Pointer();
	   p.idNum=110;
	   System.out.println(p.idNum);

	   p=null;                       //此处p=null的话，编译可以通过，符合语法规则
	   System.out.println(p.idNum);  //但是p里没有地址，不能指向Pointer对象，
	                                 //因此也无法访问实例对象里的具体数据idNum,输入会报错                              
	}   


}
