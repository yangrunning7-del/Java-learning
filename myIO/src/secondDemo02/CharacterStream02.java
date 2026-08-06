package secondDemo02;

import java.io.FileReader;
import java.io.IOException;

public class CharacterStream02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("myIO\\src\\firstDemo01\\a.txt");
        char[] buf = new char[1024];
        int len;
        /*
            read(buf)：读取数据，解码，强转三步合并，把强转的字符放到数组中
         */
        while((len = fr.read(buf)) != -1){
            //把数组中的数据变成字符串再进行打印
            System.out.print(new String(buf, 0, len));
        }
        fr.close();
    }
}
