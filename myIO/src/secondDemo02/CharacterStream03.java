package secondDemo02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharacterStream03 {
    public static void main(String[] args) throws IOException {
        /*
            拷贝一个文件夹，包括子文件夹
         */
        //源文件夹
        File src = new File("D:\\ccc");
        //目标文件夹
        File dest = new File("D:\\bbb\\dest");

        copydir(src, dest);
    }

    private static void copydir(File src, File dest) throws IOException {
        //不管dest文件夹存在不存在，都创建一个
        dest.mkdirs();
        //遍历文件夹里面的文件包括子文件夹
        File[] files = src.listFiles();
        for (File file : files) {
            if (files == null) return;
            if (file.isFile()) {
                //如果是文件
                FileInputStream fis = new FileInputStream(src);
                //复制文件时的细节，要拷贝文件夹里面的文件名，再把内容复制到对应的文件名里面去
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
                byte[] buf = new byte[1024];
                int len;
                while ((len = fis.read(buf)) != -1) {
                    fos.write(buf, 0, len);
                }

                fos.close();
                fis.close();
            }else{
                //如果不是文件，是文件夹
                copydir(file, new File(dest, file.getName()));
            }
        }
    }
}
