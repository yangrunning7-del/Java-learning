public class DataType  {
    public static void main(String[] args){
        // 浮点数扩展， 银行业务如何表示
        float f = 0.1f;
        double d = 1.0 / 10;
        System.out.println(f == d);
        System.out.println(f);
        System.out.println(d);

        float d1 = 34342343545225f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);

        // 不要用完全使用浮点数进行比较

        // ====字符拓展===
        char c1 = 'a';
        char c2 = '中';
        System.out.println((int)c1);
        System.out.println((int)c2);
        // 字符串本质是数字

        /*
        类型转化
            1.布尔值不能强制转化
            2.高转低会丢精度
            3.在操作较大的数时注意溢出问题
            4.在数字之间可以用下划线进行分割
         */


    }
}
