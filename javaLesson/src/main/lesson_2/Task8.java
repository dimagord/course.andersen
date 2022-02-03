package lesson_2;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        squireArray();

    }
    public static void squireArray() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length ; i++) {
            arr[i][i]=1;
        }

        int a = 4;
        for (int i = 0; i < arr.length ; i++) {
            arr[i][a]=1;
            a--;
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
