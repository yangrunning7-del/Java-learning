public class Operator {
    public static void main(String[] args){
        // 逻辑运算符
        boolean a = true;
        boolean b = false;
        System.out.println("a && b:"+(a && b));
        System.out.println("a || b:"+(a || b));
        System.out.println("! (a && b):"+!(a && b));

        // 位运算符
        /*
        A = 1000 1010
        B = 0111 1001

        A&B = 0000 1000
        A|B = 1111 1011
        ~B  = 1000 0110
        A^B = 1111 0011

        字符串连接符 ‘+’
         */
        int m = 1;
        int n = 2;
        // 以下这两行代码的区别和输出的结果
        // 主要取决于是先识别到字符还是算术的运算
        System.out.println("=================");
        System.out.println("" + m + n);
        System.out.println(m + n + "");
        System.out.println("=================");

        System.out.println();


        // 怎么样计算 2 * 8，才能使得速度最快？
        // 利用位运算，由于是计算机里最底层的运算原理
        System.out.println(2<<3);


    }
}
