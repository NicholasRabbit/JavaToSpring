
import java.util.*;


/*
Lambda表达式在遍历集合，同时遍历时进行筛选的用法，
同时设计到Stream的用法
*/
public class LambdaTest003 {

	
	public static void main(String[] args){
		List<User> userList = Arrays.asList(
			new User(1,"Jack",20,3500.00),
			new User(2,"Tom",35,4000.00),
			new User(3,"Lily",45,3000.00),
			new User(4,"Hans",16,2000.00),
			new User(5,"Matt",26,1000.00)
		);
		listTest(userList);
	}
	
	/*需求：1，获取年龄小于30的用户；
			2，获取工资大于2500.00的用户；
	*/
	  
	//普通做法
	public static void listTest(List<User> userList){
		//年龄小于30
		Iterator<User> it = userList.iterator();
		while(it.hasNext()){
			User user = it.next();
			if(user.getAge() < 30){
				System.out.println("年龄小于30==>" + user.toString());
			}
		}
		System.out.println("=================" );
		//工资大于2500.00
		for(User user : userList){
			if(user.getSalary() > 2500.00){
				System.out.println("工资大于2500.00==>" + user);
			}
		}
	}




}