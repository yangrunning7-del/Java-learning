package firstDemo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoInputStream03 {
    public static void main(String[] args) throws IOException {
        /*
            文件拷贝
            思想：边输入数据，边输出数据（参照的是程序）
            程序获取文件：输入流（数据要进来内存让程序获取，进来所以input）
            程序输出文件：输出流（数据要出去到文件中，出去所以output）
         */

        //TODO 想数据是进来内存还是出去内存

        //程序获取数据,也就是数据进入程序，input
        FileInputStream fis = new FileInputStream("D:\\code\\Java-leaning\\myIO\\src\\firstDemo01\\a.txt");
        //程序输出数据，也就是数据离开程序，output
        FileOutputStream fos = new FileOutputStream("myIO\\src\\firstDemo01\\b.txt");
        int b;
        while((b = fis.read()) != -1){
            fos.write(b);
        }
        fos.close();
        fis.close();
    }
}
