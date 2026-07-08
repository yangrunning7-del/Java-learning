package array;

public class ArrayDemo01 {
    public static void main(String[] args) {

        // 数组的声明和定义
        int[] arr = new int[10];
        for  (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

        // 增强for
        for (int arr2 : arr) {
            System.out.print(arr2 + " ");
        }

        // 反转数组
        System.out.println();
        // 数组的静态定义
        for (int arr_result : reverse_1(arr) ) {
            System.out.print(arr_result);
        }


    }

    // 反转数组reverse
    public static int[] reverse_1(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            result[j] = arr[i];
        }
        return result;
    }
}
