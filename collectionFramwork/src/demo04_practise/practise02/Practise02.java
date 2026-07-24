package demo04_practise.practise02;

import java.util.*;

public class Practise02 {
    public static void main(String[] args) {
        ArrayList<String> city1 = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        ArrayList<String> city3 = new ArrayList<>();

        Collections.addAll(city1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        Collections.addAll(city2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        Collections.addAll(city3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put("江苏省", city1);
        map.put("湖北省", city2);
        map.put("河北省", city3);

        // 遍历此时的hashMap集合,遍历双列集合的三种方法回忆
        Set<Map.Entry<String, ArrayList<String>>> entries = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String province = entry.getKey();
            ArrayList<String> list = entry.getValue();
            StringBuilder sb = new StringBuilder();
            for (String s : list) {
                sb.append(s + " ");
            }
            System.out.println(entry.getKey() + " = " + sb);
        }



    }
}
