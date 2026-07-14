package demo02_String;

import java.util.Scanner;

public class String04_Exemple {


    public static void main(String[] args) {


        /*
        ATM取款机案例，插入银行卡后我们需要输入密码，超过5次锁定密码，如果密码正确就显示登陆成功
        分析：
            1、定义一个正确的密码
            2、循环输入5次，输入一次，后减少一次
            3、通过charAt方法逐个比对

        */
        String password = "123456";
        System.out.println("请输入密码");

        int count = 5;
        for (int i = 0; i < count; i++) {
            Scanner s = new Scanner((System.in));
            String str = s.next();

            if(str.length() != password.length()){
                System.out.println("密码位数不对");
                System.out.println("你还有" + (4 - i) + "次机会");
                continue;
            }else {
                if(!str.equals(password)){
                    System.out.println("密码错误");
                    System.out.println("你还有" + (4 - i) + "次机会");
                }

                if(password.equals(str)){
                    System.out.println("密码输入正确");
                    break;
                }

            }
        }


        System.out.println("=========================");





    }


}
