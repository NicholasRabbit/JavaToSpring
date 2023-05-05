package com.test.base64;

import java.util.Base64;
import java.util.UUID;
import java.io.UnsupportedEncodingException;

/**
 * Base64加密范例
 * 1，Base64加密后是64个可打印的字符串，因为2^6=64，所以称作Base64;
 * 2，Base64实际是吧原来的字符串分解称byte数组后，从头开始每3个8位字节转换为4个6位字节，然后在这6位字节前面补上两个0，
 *   如果到最后不足3个8位字节，则全部用0代替，转换成的字符用"="代替，因此编码后的字符串最后会有一个或两个等号“=”;
 * 3，字节byte是程序中数据的最小表示单位，占 8 bit。
 * 参考：https://c.runoob.com/front-end/693/
 * */
public class Base64Demo {
    public static void main(String args[]){

        try {

            //1.1,正好三个字节，加密后的Base64字符没有等号
            String word = "Man";
            byte[] bytes = word.getBytes("UTF-8");
            //加密成字符串
            String encodeWord = Base64.getEncoder().encodeToString(bytes);
            System.out.println("encodeWord==>" + encodeWord);  //输出： TWFu
            //1.2，解密
            byte[] decodeBytes = Base64.getDecoder().decode(encodeWord);
            String decodeWord = new String(decodeBytes);
            System.out.println("decodeWord==>" + decodeWord); //输出: Man

            //2，测试不足三个字节的情况
            String password = "hello";
            String encodePw = Base64.getEncoder().encodeToString(password.getBytes());
            System.out.println("encodePw==>" + encodePw);  //输出： aGVsbG8=，出现一个等号，因为”hello“最后是两个字符，不足3个字节，最后一个全部用0表示，转换成字符”=“



        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }



        //testBase64();


    }

    //别人范例
    public static void testBase64(){

        try {

            // 使用基本编码
            String base64encodedString = Base64.getEncoder().encodeToString("runoob?java8".getBytes("utf-8"));
            System.out.println("Base64 编码字符串 (基本) :" + base64encodedString);

            // 解码
            byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);

            System.out.println("原始字符串: " + new String(base64decodedBytes, "utf-8"));
            base64encodedString = Base64.getUrlEncoder().encodeToString("runoob?java8".getBytes("utf-8"));
            System.out.println("Base64 编码字符串 (URL) :" + base64encodedString);

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < 10; ++i) {
                stringBuilder.append(UUID.randomUUID().toString());
            }

            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Base64 编码字符串 (MIME) :" + mimeEncodedString);

        }catch(UnsupportedEncodingException e){
            System.out.println("Error :" + e.getMessage());
        }


    }
}
