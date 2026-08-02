import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        //需求：在当前模块的aaa文件夹中创建一个a.txt文件

        //先创建aaa文件夹
        File f = new File("file\\aaa");
        boolean b = f.mkdirs();

        //再在aaa文件夹里面创建a.txt文件

        // File()里面的两个参数
        // 参数一：表示父级文件路径
        // 参数二：表示子级路径
        File f1 = new File(f, "a.txt");
        boolean newFile = f1.createNewFile();
        if (newFile) {
            System.out.println("file created");
        }else{
            System.out.println("file not created");
        }
    }
}
