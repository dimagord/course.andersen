public class HomeWorkApp {

    public static void printThreeWord() {
        System.out.println("Orange\n" +
                "\n" +
                "Banana\n" +
                "\n" +
                "Apple\n" +
                "\n");
    }

    public static void main(String[] args) {
        printThreeWord();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void checkSumSign() {
        int a = -1;
        int b = -2;
        int sum = a + b;
        if (sum>=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = -100;
        if(value<=0) {
            System.out.println("Красный");
        } else if (value<=100 && value>0) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 20;
        int b = 20;
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
