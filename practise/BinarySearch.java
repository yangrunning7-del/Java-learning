package practise;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ch = {1, 3, 44, 88, 82, 66};
        System.out.println();
        int i = searchBinary(ch, 66);
        System.out.println(i);


    }

    private static int searchBinary(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {return mid;}
            if (arr[mid] > target) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

}
