package practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        /*
            文件加密，可通过异或运算符"^"来加密与解密
         */
        FileInputStream fis = new FileInputStream("myIO\\src\\all.jpg");
        FileOutputStream fos = new FileOutputStream("myIO\\src\\out.jpg");
        byte[] buf = new byte[1024];
        int len;
        while ((len = fis.read(buf)) != -1){
            fos.write(len ^ 2);
        }

        fos.close();
        fis.close();
    }
}
