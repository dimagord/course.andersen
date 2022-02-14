

public class Cat extends Animals {
    private String name;
    private int appetite;
    private boolean isFull;
    final int runLimit = 500;
    final int swimLimit = 0;
    private int catsCount;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
        catsCount++;
        animalsCount++;
    }
    void getCatsCount(){
        System.out.println(catsCount);
    }
    @Override
    public void swim(int obstacles, int swimLimit){
        System.out.println("Cat is not able to swim");
    }

    public void info() {
        System.out.println("Cat's name: "+name+" Apetite: "+appetite + " isFull: " + isFull);
    }

    void eat (Plate plate) {
        if (plate.getAmountOfFood() >= appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }
}
