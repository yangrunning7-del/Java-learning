package doudizhuGame03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {
    // 准备牌

    // 创建一个集合用于存放牌
    static ArrayList<String> list = new ArrayList<>();
    // 创建一个集合用于存放牌和牌对应的价值(第二种排序方式)
    static HashMap<String, Integer> hm = new HashMap<>();

    static {
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] color = {"♦", "♣", "♥", "♠"};

        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        // 多一个空格，是为给字符串截取后在map集合中可以找到对应的价值
        list.add(" 小王");
        list.add(" 大王");
        // 把从J开始的牌给其绑定对应的价值，其余的再强制转化为整形集合
        hm.put("J", 11);
        hm.put("Q", 12);
        hm.put("K", 13);
        hm.put("A", 14);
        hm.put("2", 15);
        hm.put("小王", 16);
        hm.put("大王", 17);


    }

    public PokerGame() {
        // 洗牌
        Collections.shuffle(list);

        // 发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String serialNumber = list.get(i);
            if (i <= 2) {
                lord.add(serialNumber);
                continue;
            } else if (i % 3 == 0) {
                player1.add(serialNumber);
            } else if (i % 3 == 1) {
                player2.add(serialNumber);
            } else {
                player3.add(serialNumber);
            }
        }

        // 排序
        order(lord);
        order(player1);
        order(player2);
        order(player3);

        //看牌
        lookPoker("底牌", lord);
        lookPoker("player1", player1);
        lookPoker("player2", player2);
        lookPoker("player3", player3);

    }

    public void order(ArrayList<String> list) {
        // 按照自己定义的方式排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                /*
                    o1:当前要插入的元素
                    o2:已经插入的元素
                    o1 - o2的值如果为正数，则表示插入的值大于已经插入的，所以要插在左边
                 */

                String color1 = o1.substring(0, 1);
                String color2 = o2.substring(0, 1);
                int i = getValue(o1) - getValue(o2);
                return i == 0 ? color1.compareTo(color2) : i;
            }
        });
    }

    public int getValue(String poker) {


        String number = poker.substring(1);
        // 如果number是在集合map中。
        if (hm.containsKey(number)) {
            return hm.get(number);
        } else {
            return Integer.parseInt(number);
        }

    }

    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + ":");
        // 遍历list集合中的元素，元素为对应的牌
        for (String poker : list) {
            // 根据list集合去获取hm的牌
            System.out.print(poker + " ");
        }
        System.out.println();
    }


}
