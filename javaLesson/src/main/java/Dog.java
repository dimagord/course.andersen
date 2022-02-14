public class Dog extends Animals {
    private String name;
    final int runLimit = 500;
    final int swimLimit = 10;
    private static int dogsCount;

    Dog(String name) {
        this.name = name;
        dogsCount++;
        animalsCount++;
    }
    void getDogsCount(){
        System.out.println(dogsCount);
    }
}
