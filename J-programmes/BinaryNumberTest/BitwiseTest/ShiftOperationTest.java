/*
*  What is the difference between >>(<<) and >>>(or <<<)?
*  >> is an arithmetic shift and it will fill "1" if it is negative. It is signed shift.
*  >>> is a logic shift and it will fill "0" if it is positive. It is unsigned shift.
* */
public class ShiftOperationTest{

    public static void main(String[] args) {
        int i = -2;
        System.out.println("origin:" + Integer.toBinaryString(i));
        System.out.println(">>2   :" + Integer.toBinaryString(i >> 2));
        System.out.println(">>>2  :" + Integer.toBinaryString(i >>> 2));   //Two 0s at the begining weren't printed.

    }
}
