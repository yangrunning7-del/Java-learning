package demo02_String;

import java.util.Scanner;

public class String03_isEmpty {
    public static void main(String[] args){
        String s1 = "want to play games";

        /*
            关于s2和s3 的区别：
                 s2: s2是在栈内存开辟了一个命名为name2的空间，但它没有指向任何东西
                 s3: s3是在栈内存开辟了一个命名为name3的空间，但同时也在常量池开辟了一个空间里面的内容为""这个空字符，地址被指向name3
         */
        String s2 = null;
        String s3 = "";

        // 通过isEmpty()函数来判断这几个的区别

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        // System.out.println(s3.isEmpty()); // 会报错，因为源码判断是否为空是看长度

        // 平时判断字符串是否为空
        Scanner str = new Scanner(System.in);
        String str1 = str.next();

        if (str1 == null || "".equals(str1)) {
            System.out.println("字符串为空");
        }else if( !(str1 == null && "".equals(str1)) ){
            System.out.println("字符串不为空");
        }
    }
}
