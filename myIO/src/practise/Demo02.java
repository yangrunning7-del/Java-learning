package practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        /*
            将文本文件中的数据
            2-1-9-4-7-8
            进行排序变成有顺序的
            1-2-4-7-8-9
         */
        //读取文件
        FileInputStream fis = new FileInputStream("myIO\\src\\aaa.txt");

        StringBuilder sb = new StringBuilder();
        int len;
        while ((len = fis.read()) != -1) {
            sb.append((char) len);
        }
        System.out.println(sb.toString());

        //将文件转化为String按照-分割，并转化为Integer类型的数字
        String str = sb.toString();
        String[] strings = str.split("-");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (String s : strings) {
            int i = Integer.parseInt(s);
            list.add(i);
        }
        //排序
        Collections.sort(list);

        //用lambada表达式写
        Integer[] array = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt).sorted()
                .toArray(Integer[]::new);

        //打印输出
        /*
            - `FileWriter` 是**字符输出流**，可以直接写字符串 `list.get(i) + "-"`
            - `FileOutputStream` 是**字节输出流**，只允许写入 **字节 / 字节数组 /int (字节)**，不能直接传入字符串
              `list.get(i)+"-"` 会变成字符串，例如 `"1-"`
         */

        FileWriter fw = new FileWriter("myIO\\src\\bbb.txt");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                fw.write(list.get(i) + "");
            }else{
                fw.write(list.get(i) + "-");
            }
        }


        fw.close();
        fis.close();
    }
}
