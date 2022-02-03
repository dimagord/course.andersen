package lesson_2;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        task();

    }
    public static void task(){
        int[] m = {1,0,1,1,1,0,0,1,1,0};
        System.out.println(Arrays.toString(m));
        for(int i=0;i<m.length;i++){
            if (m[i]==0){
                m[i]=1;
            } else {
                m[i]=0;
            }
        }
        System.out.println(Arrays.toString(m));
    }
}
