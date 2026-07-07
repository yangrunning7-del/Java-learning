package Scanner;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextLine()){
            String s = scanner.nextLine();
            System.out.println("输出的内容位"+s);
        }

        scanner.close();
    }
}
