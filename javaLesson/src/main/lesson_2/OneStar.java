package lesson_2;

public class OneStar {
    public static void main(String[] args) {
        int i=0;
        while (i<10){
            System.out.println(returnYear(504));
            i++;
        }


    }
    public static boolean returnYear(int a){
        return a%4 == 0 && a%400==0 || a%100!=0;

    }
}
