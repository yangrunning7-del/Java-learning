package struct;

import java.util.Scanner;

public class SwitchDemo01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);


        switch(ch){
            case 'A':
                System.out.println("you are good");
                break;
            case 'B':
                System.out.println("you need more effort");
            default :
                System.out.println("what can i say");
        }

        scanner.close();
    }


}
