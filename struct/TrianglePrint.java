package struct;

public class TrianglePrint {
    public static void main(String[] args) {

        // 第一个三角形
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }

            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        // 第2个三角形
        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        }
}
