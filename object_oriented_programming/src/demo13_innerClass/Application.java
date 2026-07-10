package demo13_innerClass;

public class Application {
    public static void main(String[] args) {

        // 没有名字的初始化类，不用讲实例保存到变量中
        new Apple().eat();

        // 接口的实现的另一个写法，接口也是一个java类
        UserService userService = new UserService() {
            @Override
            public void hello() {
                System.out.println("hello");
            }
        };
    }
}

class Apple{
    public void eat(){
        System.out.println(1);
    }
}

// 创建一个接口
interface UserService{
    void hello();
}
