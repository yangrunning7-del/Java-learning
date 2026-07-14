package demo03_Package;

public class Package {
    public static void main(String[] args) {
        /*
            包装类：package：integer
            integer 是一个类，int 是一个基本数据类型
            可以把int，和integer相互转化，从而调用integer类里面的方法
         */

        // 把字符串类型，或者int类型转化类integer类型
        Integer int1 = 66;
        // 把integer类型转化为int类型
        int1.intValue();

        // int 类型 转化为 String类型
        int i = 100;
        String s1 = i + "";
        String s2 = Integer.toString(i);
        String s3 = String.valueOf(i);

        // String 类型 转化为 int类型
        String s4 = "666";
        int i1 = Integer.parseInt(s4);
        int i2 = Integer.valueOf("666").intValue(); // 先转化为integer类型，再转为int型
        int i3 = s4.indexOf("666");

    }
}
