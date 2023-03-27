
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//使用Stream去重范例
public class EliminateDuplicationTest {

    public static void main(String[] args) {
        String[] arr1 = {"A","B","C","D"};
        String[] arr2 = {"C","D","E","F"};
        List<String> list = Arrays.asList(arr1);
        List<String> list1 = Arrays.asList(arr2);
        List<String> collect = Stream.concat(list.stream(), list1.stream()).distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}