/*
JDK8新特性，集合类调用forEach(..)方法
====
继承自，Iterable.java
default void forEach(Consumer<? super T> action) {
	Objects.requireNonNull(action);
	for (T t : this) {
		action.accept(t);
	}
}
=====
*/

import java.util.*;
public class ForEachTest {

	public static void main(String[] args){
	
		List<String> list = new ArrayList<>();
		list.add("a");
        list.add("b");
        list.add("c");

		//正常遍历
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println("itrator==>" + it.next());
		}
		for(String s : list){
			System.out.println("增强for循环==>" + s);
		}

		//使用forEach(..)遍历，这里的s相当于上面增强for循环里的s
		//这里用到了Lambda表达式
		list.forEach(s -> System.out.println("forEach(..)==> " + s));
		//带条件打印
		list.forEach(s -> {
			if("b".equals(s)){
				System.out.println("带条件forEach(..)==> " + s);
			}
		});
	}
}