

public class HexOctoNumberTest {

    public static void main(String[] args) {

        //16进制
        int number = 0x305A;
        System.out.println("number(decimal) = " + number);  //这里默认打印成十进制
        System.out.println("number(hex) = " + Integer.toHexString(number));

        //8进制
        int octo = 015;
        System.out.println(octo);

    }
}
