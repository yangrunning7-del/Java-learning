package practise;

import java.io.*;


public class Demo03 {
    public static void main(String[] args) throws IOException {
        /*
            创建字节缓冲输出输入流
            一次读取多个字节
         */

        //创建对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myIO\\src\\ccc.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myIO\\src\\ddd.txt"));

        byte[] buf = new byte[1024];
        int len;
        while((len = bis.read(buf)) != -1){
            bos.write(buf, 0, len);
        }
        bos.close();
        bis.close();
    }
}
