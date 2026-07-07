package Scanner;

import java.util.Scanner;

public class Demo3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        double num = 0;
        while(scanner.hasNextDouble()){
            num = scanner.nextDouble();
            count++;
            sum = sum + num;
            System.out.println("第"+ count +"个数为" + num);
        }
        scanner.close();
        System.out.println("sum = " + sum);
        System.out.println(count+"个数的平均值为"+(double)(sum/count));
    }
}


