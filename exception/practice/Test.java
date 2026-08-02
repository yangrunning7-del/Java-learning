package exception.practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建GirlFriend对象
        GirlFriend gf = new GirlFriend();
        //创建Scanner对象用于从键盘接收
        try {
            Scanner r = new Scanner(System.in);
            System.out.println("Enter your name: ");
            gf.setName(r.nextLine());

            System.out.println("Enter your age: ");
            gf.setAge(r.nextInt());
        } catch (MyException e) {
            e.printStackTrace();
        } catch (AgeOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("your girlFriend: " + gf.getName() + " : " + gf.getAge());


    }
}
