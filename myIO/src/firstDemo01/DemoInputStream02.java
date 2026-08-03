package firstDemo01;

import java.io.FileInputStream;
import java.io.IOException;

public class DemoInputStream02 {
    public static void main(String[] args) throws IOException {
        /*
            字符循环输入流
         */
        FileInputStream fis = new FileInputStream("myIO\\src\\firstDemo01\\a.txt");
        int b;
        while((b = fis.read()) != -1){
            System.out.print((char)b);
        }
    }
}
