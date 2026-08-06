package practise;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo05 {
    public static void main(String[] args) throws IOException {
        /*
            需求：把《出师表》的文章位置在src//csb, 顺序进行恢复到一个新文件中
         */
        //读取文件
        BufferedReader br = new BufferedReader(new FileReader("myIO\\src\\csb.txt"));
        String line;
        ArrayList<String> list = new ArrayList<String>();
        while ((line = br.readLine()) != null){
            //把读取的结果放到一个集合
            list.add(line);
        }
        br.close();
        //排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1 - i2;
            }
        });
        //写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("myIO\\src\\csbRight.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();



    }
}
