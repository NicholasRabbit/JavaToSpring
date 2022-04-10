import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ForeachTest001 {

    public static void main(String[] args){
	
	    //foreach语法，它是for循环的增强版，语法更简洁
		//功能：（1）遍历数组；（2遍历集合）
		//语法格式： for(数据类型 变量名 : 数组或集合名){}

		int[]  arr={1,2,3,4,5,6,7,8,9};

		for(int i : arr){              //使用foreach遍历数组
		    System.out.println(i);
		}

		
		List<Integer> myList=new ArrayList<Integer>();
        
		 myList.add(10);     //这里int类型数据自动装箱, Integer i=new Integer(10)的省略形式:Integer i=100;
		 myList.add(30);
		 myList.add(20);
		 myList.add(65);
		 myList.add(230);

		 for(Integer i : myList){    //使用foreach遍历集合
		     System.out.println(i);
		 }

		 
		 //List集合内元素都有下标，因此可用一般for循环遍历
		 for(int i=0; i<myList.size(); i++){
		     Integer value=myList.get(i);
			 System.out.println(value);
		 }

       	
	}

}