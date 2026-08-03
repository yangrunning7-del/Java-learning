package firstDemo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        //字节输出流FileOutputStream
        //写出一段文字到本地文件中

        FileOutputStream fos = new FileOutputStream("myIO\\src\\firstDemo01\\a.txt");
        fos.write(97);
        fos.close();
    }
}
