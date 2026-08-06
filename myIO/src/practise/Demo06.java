package practise;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myIO\\src\\csb.txt"));
        String line;
        //通过TreeMap集合，Map集合可以通过数字的大小自动排序
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        while((line = br.readLine()) != null){
            int i = Integer.parseInt(line.split("\\.")[0]);
            String str = line.split("\\.")[1];
            map.put(i, str);
        }
        br.close();

        //输出
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        BufferedWriter bw = new BufferedWriter(new FileWriter("myIO\\src\\csbRRright.txt"));
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            bw.write(value);
            bw.newLine();
        }
        bw.close();
    }
}
