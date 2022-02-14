

public class Plate {
    private int amountOfFood;

    Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }


    public String info() {
        return "PLATE: " + amountOfFood;
    }

    void decreaseFood(int appetite) {
        if (amountOfFood >= appetite) {
            amountOfFood -= appetite;
        } else {
            System.out.println("Food can not be negative");
        }
    }

    int getAmountOfFood() {
        return amountOfFood;
    }

    void increaseFood(int amount) {
        amountOfFood += amount;
    }
}