package demo02_String;

public class String01 {

        public static void main(String[] args){
            String name1 = new String("John");
            String name2 = "John";

            System.out.println(name1 == name2); // 结果为false
            /*
                == 号比较的是内存地址，而name1和name2的内存地址不同
                对于name1，new String 意味着在堆内存开辟一块内存空间存着一个地址，地址指向的堆，堆（new string也是堆里面的区域）
                里面的存着字符串是一个一个拼接而成的

                对于name2，name2 = "John" 意味着在常量池中找一个内存为John的区域，找不到就自己创建一个，把内存地址指向name2

                String 里面 equals方法比较的是两个变量的内容，而不是地址，所以下面的结果为true
             */

            System.out.println(name1.equals(name2)); // 结果为true
        }

}
