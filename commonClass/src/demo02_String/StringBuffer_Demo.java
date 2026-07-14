package demo02_String;

public class StringBuffer_Demo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());   // StringBuffer()的默认内部数组能容纳的最大字符个数（即底层数组的长度），默认为16。

        System.out.println("========================");

        StringBuffer sb1 = new StringBuffer("a");
        // a字符占据一个字符，所以capacity的内容就是默认值的16+1
        // 内容默认数组可以容纳的最大字符个数，不等于实际容纳的字符个数
        System.out.println(sb1.capacity() + ":" + sb1.toString());

        System.out.println("========================");

        StringBuffer sb2 = new StringBuffer("hello");
        System.out.println(sb2.capacity() + ":" + sb2.toString());

        System.out.println("========================");
    }
}
