public class ReplaceAllPunctuationTest {

    public static void main(String[] args) {
      
        String carNums = "ABC,ddd.rrr£¬fff¡£ggg";
        String reg = "\\p{P}";
        String newCarNum = carNums.replaceAll(reg, "-");
        System.out.println("carNums==>" + newCarNum);

    }
}