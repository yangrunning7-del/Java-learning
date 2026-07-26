package doudizhuGame01;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    // 准备牌，集合写在方法体外，每次调用构造方法时，不用都再加载一次
    static ArrayList<String> list = new ArrayList<String>();
    static{

        // 创建两个字符串数组分别存花色和数字
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        // 将花色和数字对应匹配，之后放到一个集合中
        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add("大王");
        list.add("小王");

    }
    public PokerGame() {
        // 洗牌
        Collections.shuffle(list);
        // 发牌，发给三个人，还有一份底牌，所以准备四个集合用于存放
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        // 遍历list集合，前三张牌放于底牌lord集合，要用到序号，故用普通for
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i <= 2){
                lord.add(poker);
                continue;
            }else if (i % 3 == 0){
                player1.add(poker);
            }else if (i % 3 == 1){
                player2.add(poker);
            }else{
                player3.add(poker);
            }
        }

        // 看牌
        lookPoker("底牌", lord);
        lookPoker("zhangShan", player1);
        lookPoker("liShi", player2);
        lookPoker("wangWu", player3);

    }

    public void lookPoker(String name, ArrayList<String> list){
        System.out.print(name + ": {" );
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println("}");
        System.out.println();

    }

}
