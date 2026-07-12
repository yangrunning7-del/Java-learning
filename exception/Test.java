package exception;

// Exception
public class Test {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        // 异常范围从小到大

        // 要选中代码块，ctrl + alt + t  快捷键
        try {
            System.out.println(a / b);
        } catch (Error e){
            System.out.println("Error");
        } catch(Exception e){
            System.out.println("Exception");
        } catch(Throwable t){
            System.out.println("Throwable");
        } finally{
            System.out.println("finally");
        }

        System.out.println("================================");

        try {   //try监控区域

            if (b == 0){// 主动抛出异常 throw throws
                        // 主动抛出的异常，一般在方法中用

                // ArithmeticException也是一个类，所以可以new
                throw new ArithmeticException("ArithmeticException");// 主动抛出的异常
            }

            System.out.println(a / b);
        }catch (ArithmeticException e){
            // catch()里面填写的是：想要捕获的异常类型
            // catch捕获异常
            System.out.println("程序出现异常，变量b的值不能为0");
        }finally{ //处理善后工作
            System.out.println("finally");
        }

        //finally, 可以不要finally, 假设IO，资源，关闭


    }
}
