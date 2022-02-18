

public class Cat extends Animals {
    private final int appetite;
    private boolean isFull;
    final private int runLimit = 500;
    final private int swimLimit = 0;
    private static int catsCount;

    Cat(String name, int appetite) {
        super.name = name;
        super.swimLimit=this.swimLimit;
        super.runLimit=this.runLimit;
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
