package demo02_String;

import java.util.Scanner;

public class String05_Exemple {
    public static void main(String[] args) {
         /*
            example:将一个字符串的首写字母大写其余字母全部小写，并且每个字符用下划线_分支分割
            如：hadffi
            result:H_a_d_f_f_i

            分析：
                1、输入接受字符串，并转化为字符串数组
                2、循环遍历字符串
         */

        System.out.println("请输入不含数字的字符串");
        Scanner sentence1 = new Scanner(System.in);
        String str = sentence1.next();
        char[] str1 = str.toCharArray();

        String result = "";
        for (int i = 0; i < str1.length; i++) {
            char ch = str1[i];
            String ch1 = String.valueOf(ch);
            if(i == 0){
                result += ch1.toUpperCase();
                result += "_";
            }
            if(i == str1.length-1){
                result += ch1.toLowerCase();
            }else{
                result += ch1.toLowerCase();
                result += "_";
            }
        }
        System.out.println(str);
        System.out.println(result);



    }
}
