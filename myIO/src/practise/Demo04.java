package practise;

import java.io.*;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        /*
            字符缓冲输出输入流
         */

        //字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("myIO\\src\\ddd.txt"));
        //读取文件里面的内容
        //String line = br.readLine();
        //System.out.println(line);
        //读取全部的内容
        String line;
        /*
            关于readLine()方法的细节
            1.一次读一整行，遇到回车换行结束
                但是不会把回车换行当成内容读取到内存中
         */
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }

        //字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("myIO\\src\\eee.txt"));
        String line1;
        while ((line1 = br.readLine()) != null) {
            bw.write(line1);
            bw.newLine();
        }
        bw.close();
        br.close();


    }
}
