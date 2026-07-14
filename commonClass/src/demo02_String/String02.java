package demo02_String;

import java.util.Scanner;

public class String02 {
    /*
        输入一个字符串，统计字符串里面大写小写和数字的个数
     */

    public static void main(String[] args) {

        System.out.println("Enter a string");
        Scanner in = new Scanner(System.in);

        String s = in.next();

        int n = s.length();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // charAt 方法是查找所在位置的字符串
            if('a' <= c && c <= 'z') {
                count1++;
            }else if('A' <= c && c <= 'Z') {
                count2++;
            }else if('0' <= c && c <= '9') {
                count3++;
            }else{
                System.out.println("Invalid input, please try again");
                break;
            }
        }

        System.out.println("输入的内容为：" + s);
        System.out.println("小写字母的个数为" + count1);
        System.out.println("大写字母的个数为" + count2);
        System.out.println("数字的个数为" + count3);


    }
}
