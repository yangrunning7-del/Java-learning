import java.io.File;
import java.io.IOException;

public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        //删除一个多级文件夹，先要把文件夹里面的文件都删掉再删除文件夹
        File file = new File("file\\aaa");
        delete(file);
    }

    /**
     * 作用：用于文件夹的删除
     * @param file：要删除的文件
     */
    public static void delete(File file){

        //进入文件夹并获取文件夹里的所有文件
        File[] files = file.listFiles();
        if (files != null) {
            //遍历
            for (File f : files) {
                if (f.isFile()) {
                    f.delete();
                }else{
                    delete(f);
                }
            }
            //最后再删除自己
            file.delete();
        }

    }
}
