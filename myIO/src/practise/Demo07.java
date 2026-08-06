package practise;

import java.io.*;

public class Demo07 {
    public static void main(String[] args) throws IOException {
        //IO流：随用随创建，什么时候不用就什么时候关闭

        /*
            第一次运行控制台输出：欢迎使用本软件，第 1 次使用免费～
            第二次运行控制台输出：欢迎使用本软件，第 2 次使用免费～
            第三次运行控制台输出：欢迎使用本软件，第 3 次使用免费～
            第四次及之后运行控制台输出：本软件只能免费使用 3 次，欢迎您注册会员后继续使用～
         */

        //把文件中的数据读取到内存中
        BufferedReader br = new BufferedReader(new FileReader("myIO\\src\\fff.txt"));
        int count = Integer.parseInt(br.readLine());
        br.close();
        count++;
        if (count <= 3) {
            System.out.println("第" + count + "次运行控制台输出：欢迎使用本软件，第" + count + "次使用免费～");
        } else {
            System.out.println("第四次及之后运行控制台输出：本软件只能免费使用 3 次，欢迎您注册会员后继续使用～");
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("myIO\\src\\fff.txt"));
        //字符输出流，如果不加"",就会按照编码表里的符号输出，如97，就会输出a，而不是输出97，加了""就会整体转为String类型
        bw.write(count + "");
        bw.close();

    }
}
