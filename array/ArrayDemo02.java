package array;

import java.util.Arrays;

public class ArrayDemo02 {
    public static void main (String[] args) {
        int[] a = {2, 33, 1, 22, 53,221, 992, 26};
        System.out.print(Arrays.toString(a));
        System.out.println();
        System.out.println("=======");
        Arrays.sort(a);
        System.out.print(Arrays.toString(a));
        System.out.println("========");

        int [] sort = sort(a);
        System.out.print(Arrays.toString(sort));
        System.out.println("========");
        int [] resort = resort(a);
        System.out.print(Arrays.toString(resort));
    }

    // 冒泡排序
    // 1、比较数组中，两个相邻的元素，如果第一个数比第二个数大，就交换他们的位置。
    // 2、每一个比较都会产生一个最大或者最小的数
    // 3、下一轮则可以减少一次排序
    // 4、依次排序直到结束
    public static int[] sort(int[] arr) {
        // 外层循环，判断这个循环需要走几次
        for (int i = 0; i < arr.length - 1; i++) {
            // 减i是因为每排序一次，就会产生一个最值，这个最值不用参与交换，交换的次数就减少了
            // 减1是为了不让边界溢出

            // 理解一下这个优化。
            boolean flag = false;

            // 内层循环，判断比较交换
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }

            }
            if(!flag) {
                break;
            }
        }
        return arr;
    }

    // 逆序的冒泡排序
    public static int[] resort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}