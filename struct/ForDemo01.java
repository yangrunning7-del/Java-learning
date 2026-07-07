package struct;

public class ForDemo01 {
    public static void main(String[] args){
        // 练习1：分别计算0到100中奇数的和，偶数的和
        int OddSum = 0;
        int EvenSum = 0;
        for( int i = 0 ; i < 100 ; i++){
            if(i % 2 == 0){
                EvenSum += i;
            }else {
                OddSum += i;
            }
        }
        System.out.println("OddSum = " + OddSum +"\nEvensum = " + EvenSum);

        System.out.println("======================");

        // 练习2： 分别计算从0到100之间能够被5整除的数，并每行输出3个
        for( int i = 1 ; i < 106 ; i++){
            if(i % 5 == 0){
                System.out.print(i + "\t");
            }
            if(i % 15 == 0){
                System.out.print("\n");
            }
        }

        System.out.println("============================");

        // 练习3：输出九九乘法表
        // 区别print和println，\t转义字符相当于Tap
        for( int i = 1 ; i < 10 ; i++){
            for( int j = 1 ; j <= i; j++){
                System.out.print(i + "*" + j +"=" + i * j + "\t");
            }
            System.out.print("\n");
        }
        
    }
}
