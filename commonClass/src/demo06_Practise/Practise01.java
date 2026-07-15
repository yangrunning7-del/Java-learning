package demo06_Practise;

import java.util.Arrays;

public class Practise01 {
    public static void main(String[] args){
        /*
            # 一、已知字符串

            String str = "ac,42,123,sd Fa,c df,4,adf,5ewRRre ";

            1. 把字符串按，进行分割
            2. 找出统计出字符串里抽的数字个数
            3. 找出a字符所在的所有索引
            4. 把里面的大写转化成小写
            5. 把里面的小写转化成大写
            6. 找出最后一个R所在的索引
            7. 统计字符串的长度
            8. 把字符串前后的空格去掉
            9. 把字符串中所有空格去掉


         */

        String str = "ac,42,123,sd, Fa,c df,4,5ewRRre";

        // Arrays.toString()
        String str1 = Arrays.toString(str.split(","));
        System.out.println(str1);

        System.out.println("=======================");
        int count = 0;

        int length  = str1.length();
        for (int i = 0; i < length; i++) {
            char ch = str1.charAt(i);
            if ('0' <= ch && ch <= '9') {
                count++;

            }
        }
        System.out.println("=======================");
        System.out.println(count);


        System.out.println("=======================");
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            char ch = str1.charAt(i);
            if(ch == 'a'){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("========================");
        String result = "";



        char[] str2 = str.toCharArray();
        for (int i = 0; i < str2.length; i++) {
            char ch = str2[i ];
            String ch1 = String.valueOf(ch);
            if('a' <= ch && ch <= 'z'){
                result += ch1.toUpperCase();
            }else{
                result += ch1;
            }
        }
        String result1 = String.valueOf(result);
        System.out.println(result);


        System.out.println("=======================");
        String result3 = "";
        char[] str3 = str.toCharArray();
        for (int i = 0; i < str3.length; i++) {
            char ch = str3[i];
            String ch1 = String.valueOf(ch);
            if('A' <= ch && ch <= 'A'){
                result3 += ch1.toLowerCase();
            }else{
                result3 += ch1;
            }
        }
        System.out.println(result3);


        System.out.println("========================");
        for (int i = 0; i < str3.length; i++) {
            char ch = str3[i];
            String ch1 = String.valueOf(ch);
            if(ch == 'R'){
                System.out.println(i);
                break;
            }
        }

        System.out.println("========================");
        System.out.println(str.length());

        System.out.println("========================");
        System.out.println(str.strip());
        System.out.println(str.replace(" ", ""));



    }
}
