public class Dog extends Animals {
    final private int runLimit = 500;
    final private int swimLimit = 10;
    private static int dogsCount;

    Dog(String name) {
        super.name = name;
        super.swimLimit=this.swimLimit;
        super.runLimit=this.runLimit;
        dogsCount++;
        animalsCount++;
    }
    int getRunLimit(){
        return runLimit;
    }
    int getSwimLimit(){
        return swimLimit;
    }
    void getDogsCount(){
        System.out.println(dogsCount);
    }
}
