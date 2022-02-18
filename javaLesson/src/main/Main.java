import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange = new Orange();
        Box appleBox = new Box(apple1,apple3);
        Box sameAppleBox = new Box(apple1,apple3);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox.compare(sameAppleBox));
        appleBox.addFruits(orange);
        System.out.println(appleBox.getWeight());

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Box orangeBox = new Box(orange1,orange2,orange3);
        orangeBox.showItems();
        System.out.println(orangeBox.getWeight());
        orangeBox.addFruits(orange4);

        System.out.println(appleBox.compare(orangeBox));

        System.out.println(appleBox.getFruitAmountInBox());
        appleBox.swap(sameAppleBox);
        System.out.println(appleBox.getFruitAmountInBox());

        appleBox.swap(orangeBox);
        System.out.println(orangeBox.getFruitAmountInBox());
        System.out.println(appleBox.getFruitAmountInBox());

        System.out.println(orangeBox.getItems());
        System.out.println(appleBox.getItems());




    }
}
