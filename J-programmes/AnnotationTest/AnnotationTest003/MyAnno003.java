public @interface MyAnno003 {

	String  name();
	int age();

	byte bb() default 30;

	int[] arr()default {1,2,3};



}