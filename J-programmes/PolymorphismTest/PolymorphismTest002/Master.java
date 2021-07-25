public class Master {

    public void feed(Pet pet){    //此处写这个方法，可以免于以后增加宠物而改动Master代码
	                              //现在无论怎么增加，只需在PolyTest里新建对象就可以了，把地址赋予此行pet就行
	     pet.play();              //把Master和具体的宠物如Dog,Cat等解耦合了。

	}

}