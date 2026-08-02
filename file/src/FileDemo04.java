import java.io.File;

public class FileDemo04 {
    public static void main(String[] args) {
        /*
            需求：统计一个文件的总大小
         */

        File file = new File("collectionFramwork");
        long len = getLen(file);
        System.out.println(len);
    }

    /**
     *  作用：统计一个文件的总大小
     *  参数：需要统计的文件
     *  返回值为long
     *
     */
    public static long getLen(File file){
        long len = 0;
        //通过listFiles()方法获取该文件夹的所有文件和文件夹
        File[] files = file.listFiles();


        if (files != null) {
            //遍历判断
            for (File file1 : files) {
                if (file1.isFile()) {
                    //如果是文件，就把当前文件的大小加到len中
                    len += file1.length();
                }else {
                    len += getLen(file1);
                }
            }
        }
        return len;

    }
}
