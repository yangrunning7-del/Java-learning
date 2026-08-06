package firstDemo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoInputStream04 {
    public static void main(String[] args) throws IOException {
        /*
            文件拷贝，自定义每次拷贝的字节数量
         */
        FileInputStream fis = new FileInputStream("D:\\code\\Java-leaning\\myIO\\src\\firstDemo01\\a.txt");
        FileOutputStream fos = new FileOutputStream("D:\\code\\Java-leaning\\myIO\\src\\firstDemo01\\b.txt");
        //定义每次读多少个字节
        byte[] buf = new byte[1024];
        //由于read时存在缓存区域，用len作为中间变量来读取转化得到读到的数组
        int len;
        while((len = fis.read(buf)) != -1){
            fos.write(buf, 0, len);
        }



        fos.close();
        fis.close();
    }
}
