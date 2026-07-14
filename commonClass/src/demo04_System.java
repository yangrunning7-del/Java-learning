import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class demo04_System {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);

        Date date = new Date();
        System.out.println(date + ":" + date.getTime());

        // System.exit(1); // 终止程序
        System.out.println("========================");

        // 关于BigInteger,对于超出Integer范围的数起作用
        System.out.println(Integer.MAX_VALUE);
        Integer i = Integer.MAX_VALUE + 1; // 栈溢出
        System.out.println(i);

        BigInteger bigInteger = new BigInteger("2147483647");
        BigInteger result = bigInteger.add(new BigInteger("1"));
        System.out.println(result);

        System.out.println("========================");

        // 关于浮点数或者double型进行运算时精度丢失


        System.out.println(1.0 - 0.33); // 结果为0.6699999999999999，精度丢失，正确为：0.67
        System.out.println(0.01 + 0.09); // 结果为0.09999999999999999，精度丢失，正确为：0.10
        System.out.println("========================");

        // 所以要通过BigDecimal类，来计算，可以精确精度
        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal result1 = b1.add(new BigDecimal("-0.33"));

        BigDecimal b2 = new BigDecimal("0.01");
        BigDecimal result2 = b2.add(new BigDecimal("0.09"));

        System.out.println(result1); // 0.67
        System.out.println(result2); // 0.10

    }
}
