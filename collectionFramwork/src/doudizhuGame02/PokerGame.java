package doudizhuGame02;

import java.util.*;

public class PokerGame {

    // 准备牌，写在静态代码块，随着构造方法的执行而执行，不过它只执行一次。
    // 为什么要把准备的阶段写在这里？

    // 集合用于数字序列的存放
    static ArrayList<Integer> list = new ArrayList<>();

    // 集合hashMap用于每张牌与对应的序列，且以数字集合为键，牌为值
    static HashMap<Integer, String> hm = new HashMap<Integer, String>();


    static {
        // 花色
        String[] color = {"♦", "♣", "♥", "♠"};
        // 数字
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        // 现在为排序还有抽牌，需要将每一张牌与数字绑定在一起
        // 创建两个集合，一个用于存放牌，一个用于存放牌对应的序号，并且写为成员变量

        int serialNumber = 1;
        for (String n : number) {
            // 依次表示每一个数字
            for (String c : color) {
                // 依次表示每一个花色
                hm.put(serialNumber, c + n);
                // 把从小到大的序号添加到集合中
                list.add(serialNumber);

                serialNumber++;
            }
        }

        // 添加大小王
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);


    }

    public PokerGame() {
        // 准备牌：在静态代码块已经实现

        // 打乱牌，也就是打乱牌对应的序列，利用Collections工具类
        Collections.shuffle(list);


        // 以下集合存贮的为对应的键，也就是牌对应的序列号
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        // 发牌，创建四个集合用于存放牌，并且要求拿到的牌按照顺序排列，故选择TreeSet
        for (int i = 0; i < list.size(); i++) {
            // 获取list集合对应的序列号
            int serialNumber = list.get(i);
            if (i <= 2) {
                lord.add(serialNumber);
            }else if (i % 3 == 0) {
                player1.add(serialNumber);
            }else if (i % 3 == 1) {
                player2.add(serialNumber);
            }else{
                player3.add(serialNumber);
            }
        }

        // 看牌
        lookPoker("底牌", lord);
        lookPoker("zhangShan", player1);
        lookPoker("LiShi", player2);
        lookPoker("WangWu", player3);


    }

    public void lookPoker(String name, TreeSet<Integer> tm) {
        // 通过list集合来，对应找对应的牌，
        System.out.print(name + " ");
        for (Integer i : tm) {
            // 获取每一张牌
            String Poker = hm.get(i);
            System.out.print(Poker + " ");
        }
        System.out.println();

    }
}
