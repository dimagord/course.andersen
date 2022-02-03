package lesson_2;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(task9(10, 2)));

    }
    public static int[] task9(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]= initialValue;
        }
        return arr;
    }
}
