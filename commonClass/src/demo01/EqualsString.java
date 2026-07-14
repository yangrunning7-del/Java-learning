package demo01;


// 理解并且介绍下java中的equals方法，通过string里面的equals方法，和object里面的equals方法来进行比较
public class EqualsString {
    // 1. 定义核心字段：字符数组（就是String底层那个value）
    private final char[] value;

    // 2. 构造方法：把传进来的字符串拆成字符数组存起来
    public EqualsString(String str) {
        this.value = str.toCharArray(); // 利用JDK现成方法转成char[]
    }

    // 3. 重写equals（模仿String源码逻辑）
    @Override
    public boolean equals(Object obj) {
        // 第一步：地址相同，秒返回true
        if (this == obj) {
            return true;
        }

        // 第二步：类型判断（只跟自己类比较）
        if (obj instanceof EqualsString) {
            EqualsString another = (EqualsString) obj; // 安全强转

            // 第三步：比较长度
            int n = this.value.length;
            if (n == another.value.length) {
                char[] v1 = this.value;
                char[] v2 = another.value;
                int i = 0;
                // 第四步：逐个字符对比
                while (n-- != 0) {
                    if (v1[i] != v2[i]) {
                        return false; // 只要有一个不同就返回false
                    }
                    i++;
                }
                return true; // 长度相同，每个字符都相同，返回true
            }
        }
        return false; // 类型不对或长度不对，返回false
    }

    /*
        // java.lang.Object 类中的源码啊，比较的是内存地址
    public boolean equals(Object obj) {
        return (this == obj);
}

     */


    // 顺便重写toString方便看结果
    @Override
    public String toString() {
        return new String(value);
    }

    // 测试入口
    public static void main(String[] args) {
        EqualsString es1 = new EqualsString("abc");
        EqualsString es2 = new EqualsString("abc");
        EqualsString es3 = new EqualsString("abd");

        System.out.println(es1.equals(es2)); // true
        System.out.println(es1.equals(es3)); // false
        System.out.println(es1.equals("abc")); // false（因为类型不同，返回false）
    }
}