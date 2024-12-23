
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortComparatorTest {

    public static void main(String[] args) {
       sort();
    }

    public static void sort(){
        List<User> userList = new ArrayList<>();
        userList.add(new User(5,"Tom"));
        userList.add(new User(10,"Jerry"));
        userList.add(new User(13,"Lily"));
        userList.add(new User(1,"Ben"));
        userList.add(new User(2,"Jack"));
        userList.add(new User(7,"Hans"));

        for(User u : userList){
            System.out.println("before=>" + u);
        }

        /*被比较的类不用继承Comparable或者写一个Comparator.java比较器了，直接用Stream比较器，默认按升序排序
        * */
        //第一种写法：
        List<User> sortedList1 = userList.stream().sorted(((o1, o2) -> o1.getId() - o2.getId())).collect(Collectors.toList());
        for(User u : sortedList1){
            System.out.println("after sorted 01 =>" + u);
        }

        //第二种写法：
        List<User> sortedList2 = userList.stream()
			.sorted(Comparator.comparing(User::getName))
			.collect(Collectors.toList());

        for(User u : sortedList2){
            System.out.println("after sorted 02=>" + u);
        }

    }


}
