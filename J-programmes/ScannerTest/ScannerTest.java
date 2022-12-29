
import java.util.*;


//Scanner用法范例
public class ScannerTest {

	public static void main(String[] args){
		
		List<User> list = new ArrayList<>();
		doSome(list);
	}
	

	public static void doSome(List<User> list){
		
		while(true){
			Scanner scan = new Scanner(System.in);
			System.out.println("添加：add");
			System.out.println("展示：list");
			System.out.println("退出：exit");
			String order = scan.next();
			switch (order){
			case "add":
				System.out.print("请输入id:");
				int id = scan.nextInt();
				System.out.print("请输入name:");
				String name = scan.next();
				list.add(new User(id,name));
				break;
			case "list":
				show(list);
				break;
			case "exit":
				scan.close();  //注意：io流一定要关闭
				System.exit(0);
			default:
				break;
			}
		
		}
	
	}

	public static void show(List<User> list){
		for(User u : list){
			System.out.println(u);
		}
	}

}