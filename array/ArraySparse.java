package array;

import java.util.Arrays;

public class ArraySparse {
    public static void main(String[] args){
        // 创建原数组
        int[][] arr1 = new int[5][5];
        arr1[1][1] = 5;
        arr1[1][2] = 8;
        arr1[3][1] = 9;
        arr1[3][3] = 7;

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("=============");
        // 调用稀疏数组函数
        int[][] ArrSparse = sparse(arr1);
        // 打印
        for (int i = 0; i < ArrSparse.length; i++){
            for (int j = 0; j < ArrSparse[i].length; j++){
                System.out.print(ArrSparse[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=============");
        // 调用稀疏数组还原方法
        int[][] arr3 = re_sparse(ArrSparse);
        for (int i = 0; i < arr3.length; i++){
            for (int j = 0; j < arr3[i].length; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }


    // 稀疏数组方法
    public static int[][] sparse(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    count++;
                }
            }
        }
        int[][] sparse = new int[count + 1][3];
        sparse[0][0] = arr.length;
        sparse[0][1] = arr[0].length;
        sparse[0][2] = count;
        int index = 1;
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                if (arr[m][n] != 0) {
                    sparse[index][0] = m;
                    sparse[index][1] = n;
                    sparse[index][2] = arr[m][n];
                    index++;

                }
            }
        }
        return sparse;
    }


    // 稀疏数组还原
    public static int[][] re_sparse(int[][] arr) {

        // 错误，int [][] arr2 = new int[arr.length][arr[0].length];

        // 从稀疏数组第一行读取原始数组的行数、列数
        int originRow = arr[0][0];
        int originCol = arr[0][1];
        // 按原始数组大小创建空白二维数组
        int[][] arr2 = new int[originRow][originCol];

        for (int i = 1; i < arr.length; i++) {
            int x = arr[i][0];
            int y = arr[i][1];
            int val = arr[i][2];
            arr2[x][y] = val;
        }


        return arr2;
    }


}

