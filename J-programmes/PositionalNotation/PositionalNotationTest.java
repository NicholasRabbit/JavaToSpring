public class PositionalNotationTest{

	public static void main(String[] args){
		//1,十进制，直接写，默认是十进制
		int decimalNum = 10;
		System.out.println("decimal:"+ decimalNum);

		//2,二进制，用0b开头，例：0b0101
		int binNum = 0b101011;
		System.out.println("binary:" + Integer.toBinaryString(binNum));
		System.out.println("decimal of binary:" + binNum);

		//3,八进制，用0开头，例：07777
		//int octalNum = 07999;  //测试编译报错。八进制各位数都得小于8
		int octalNum = 07777;  
		System.out.println("octal:" + Integer.toOctalString(octalNum));


        //16进制，用0x开头，9后面的字母大小写均可
        int hex = 0x9EAFCBA;
		//sout默认打印成十进制
        System.out.println("decinal of hexdecimal:" + hex);  
		//sout打印十六进制
		System.out.println("hexadecimal:" + Integer.toHexString(hex));
	}

}
