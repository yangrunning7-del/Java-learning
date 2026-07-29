package util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CodeUtil {
    /*新建一个util包，包中新建CodeUtil类，定义一个可以生成验证码的静态方法

    验证码要求：

            	包含大小写A-Z和数字0-9

            	字母4个，数字1个

	字母和数字的位置是随机的。

    完成上面的要求之后，自己思考，如果换一个验证码的需求是否可以完成呢？

    比如1：包含大小写A-Z和数字0-9，总长度为5，内容随机的，生成的结果不包含大小写字母o

    比如2：包含大小写A-Z和数字0-9，总共长度为4或5，内容都是随机的，但是数字不能连续*/

    static public String getCode(){
        String[] list01 = {"A", "B", "C", "D", "E", "F", "G",
                "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U",
                "V", "W", "X", "Y", "Z", "a", "b",
                "c", "d", "e", "f", "g", "h", "i",
                "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z"};
        String[] list02 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",};
        Random r = new Random();
        String[] sb = new String[5];
        for (int i = 0; i < 4; i++) {
            sb[i] = list01[r.nextInt(list01.length)];
        }
        sb[4] = list02[r.nextInt(list02.length)];

        List<String> list = Arrays.asList(sb);
        Collections.shuffle(list);

        // 重新将list中的集合拼成字符串
        StringBuilder ssb = new StringBuilder();
        for (String s : list) {
            ssb.append(s);
        }
        return ssb.toString();

    }



}
