package demo02_String;

public class StringBuffer_Demo01 {
    public static void main(String[] args){

        String s1 = "hello";
        String s2 = s1 + "world";
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println(s1 == s2);

        /*
         关于字符串的追加
         String s1 = "hello";
         String s2 = s1 + "world";
         对于String来说，每次创建变量，如s1的创建，会在常量池创建hello，
                                    s2的创建，会先在常量池创建world，再在堆内存中创建一个s1+world，一共产生了三个变量
         而StringBuffer就避免了这个问题
        */
        System.out.println("================================");

        StringBuffer str1 = new StringBuffer("hello");
        StringBuffer str2 = str1.append("world");
        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);

        // str1 和str2是相等的，内存地址都是一样，通过StringBuffer来追加改变，
        System.out.println(str1 == str2);

        /*
            String来追加新字符串的话每次都会至少产生两个对象一个是在常量池，一个在堆内存中，这样就会浪费内存
            StringBuffer的话就是地址不变，每次追加新的内容都改变地址里面的内容
         */


        /*
         * ============================================================
         * 【经典面试题】String、StringBuffer、StringBuilder 的区别
         * ============================================================
         *
         * 1. String（不可变对象）
         *    特点：一旦创建，内容不可更改。每次拼接（如 + 操作）都会在堆内存中
         *         产生一个新的 String 对象，旧的仍留在常量池或堆中等待 GC。
         *    线程安全：是（因为不可变，天然线程安全）
         *    效率：最低（频繁创建对象，浪费内存）
         *    使用场景：少量固定字符串，或作为 HashMap 的 Key
         *
         * 2. StringBuffer（可变对象）
         *    特点：在原对象上直接修改内容（append、insert 等），不会产生新对象。
         *         所有方法都加了 synchronized 关键字，保证多线程安全。
         *    线程安全：是（有同步锁）
         *    效率：中等（锁机制带来性能开销）
         *    使用场景：多线程环境下频繁修改字符串
         *
         * 3. StringBuilder（可变对象）
         *    特点：和 StringBuffer API 完全一样，在原对象上修改，但
         *         没有加同步锁，所以线程不安全，但速度最快。
         *    线程安全：否（无锁）
         *    效率：最高（纯内存操作）
         *    使用场景：单线程环境下频繁修改字符串（日常开发 99% 的情况都用它）
         */

    }
}
