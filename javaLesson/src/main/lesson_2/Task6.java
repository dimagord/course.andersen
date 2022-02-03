package lesson_2;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        bigArray();

    }
    public static void bigArray(){
        int[] arr = new int[100];
        int i=0;
        while(i<100){
            arr[i]=i+1;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
