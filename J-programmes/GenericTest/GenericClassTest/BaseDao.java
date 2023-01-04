//继承中泛型使用的几种情况:
public class BaseDao<T1,T2> {
	
	T1 t1;
	T2 t2;

}


/*
* 一，子类不保留父类的泛型，那父类中的泛型默认都是Object了
*/
class SonDao01<E1,E2> extends BaseDao{  //等同于：class SonDao<E1,E2> extends BaseDao<Object,Object>
	E1 e1;
	E2 e2;
}

/*
* 二，父类使用具体类型
*/
class SonDao02<E1,E2> extends BaseDao<String,Integer> {

}
/*
* 三，子类保留全部泛型，可以增加子类自己的泛型。 
*/
class SondDao03<E1,E2,T1,T2> extends BaseDao<T1,T2>{

}

/*
* 四，部分保留
*/
class SonDao04<E1,E2,T1> extends BaseDao<T1,String>{

}



/*
* 五，其他注意事项：
* 子类父类要有<T>都写，且都写相同的字母"T"。
* 如果子类写<E>会报错"T"找不到符号，说明父类的泛型不确定，则子类需继承才可。
*/
class Father<T> {

}
//class Son<E> extends Father<T>{}  //此处报错
class Son<T> extends Father<T>{}    //正确

