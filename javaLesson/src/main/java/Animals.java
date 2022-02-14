public class Animals {
    protected int animalsCount;
    protected void run(int obstacle, int runLimit){
        if (obstacle<=runLimit){
        System.out.println("Пробежал " +obstacle+"метра");
        } else
            System.out.println("Can not run that far");
    }
    protected void swim(int obstacle, int swimLimit){
        if (obstacle<=swimLimit){
        System.out.println("Проплыл"+ obstacle+ "метра");
        }else {
            System.out.println("Can not swim that far");
        }
    }
    void getAnimalsCount() {
        System.out.println(animalsCount);
    }
}
