public class DomainTest001{
    public static void main(String[] args){
        int a=10;
        System.out.println(a);

}
    public static void doSome(String[] args){
    
        int a=20;                                  
        System.out.println(a);
		//不同的作用域可以用名字相同的变量，都是a本例
	    //注意第二个域内作用方法名称是doSome，不能用上面域的main,会冲突

}



}
