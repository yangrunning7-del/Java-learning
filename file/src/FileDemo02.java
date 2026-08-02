import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {

        File file = new File("file\\");
        haveAVI(file);

        //获取本地所有的盘符
        File[] files = File.listRoots();
        for (File file1 : files) {
            haveAVI(file1);
        }


    }

    public static void haveAVI(File file) throws IOException {
        //递归遍历所有文件4个步骤

        //1、进入文件夹并获取该文件夹里的所有内容，包括文件和文件夹
        File[] files = file.listFiles();
        //2、遍历文件夹
        if (files != null) {
            for (File f : files) {
                //3、判断。如果这是文件，就执行业务逻辑
                if (f.isFile() && f.getName().endsWith(".txt")) {
                    System.out.println(f.getName());
                }else{
                    //4、如果是文件夹就遍历递归，参数要为src的次一级文件夹，以此递推
                    haveAVI(f);
                }
            }
        }
    }
}
