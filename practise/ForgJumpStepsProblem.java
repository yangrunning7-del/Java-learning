package practise;

public class ForgJumpStepsProblem {
    public static void main(String[] args) {
        /*
            青蛙跳台阶问题
            现在一共有 n 个台阶，一只青蛙每次只能跳一阶或是两阶，那么一共有多少种跳到顶端的方案？
            例如 n=2，那么一共有两种方案，一次性跳两阶或是每次跳一阶。
            现在请你设计一个 Java 程序，计算当台阶数为 n 的情况下，能够有多少种方案到达顶端。
         */
        int a = jumps(5);
        System.out.println(a);
    }

    private static int jumps(int n){
        int[] num = new int[n + 1];
        num[0] = 0;
        num[1] = 1;
        for(int i = 2; i <= n; i++){
            num[i] = num[i - 2] + num[i - 1];
        }
        return num[n];
    }
}
