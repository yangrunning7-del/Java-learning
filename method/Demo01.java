package method;

public class Demo01 {
    public static void main(String[] args) {

        // 关于方法的调用，new一个对象
        Demo01 demo01 = new Demo01();
        demo01.test(1, 25, 5, 6, 5);
    }

    public void test (int...i){
        for(int x = 0; x < i.length; x++ ){
            System.out.println(i[x]);
        }
    }
}

