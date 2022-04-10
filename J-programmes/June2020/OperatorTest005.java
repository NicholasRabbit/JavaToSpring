public class OperatorTest005{
    public static void main(String[] args){
        int e,f,g,h;
             e=10;
             f=20;
             g=30;
             h=10;
        System.out.println(e<f||h<g++);   //短路或：||，前面算子已经为true，后面短路，不编译
        System.out.println(g);            //此处g输出值为30
        System.out.println(f>e|h++>e);    //此处逻辑或|，无论前面算子结果为何，后面都要编译
		System.out.println(h);            //此处h输出值为11，前面自加1进行了编译
}



}