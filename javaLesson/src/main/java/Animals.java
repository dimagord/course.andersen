 abstract class Animals {
    protected String name;
    protected static int animalsCount;
    protected int runLimit;
    protected int swimLimit;

    protected void run(int obstacle, int runLimit){
        if (obstacle<=runLimit){
        System.out.println(name+ " пробежал " +obstacle+"метра");
        } else
            System.out.println("Can not run that far");
    }
    protected void swim(int obstacle, int swimLimit){
        if (obstacle<=swimLimit){
        System.out.println(name+" проплыл"+ obstacle+ "метра");
        }else {
            System.out.println("Can not swim that far");
        }
    }
    void getAnimalsCount() {
        System.out.println(animalsCount);
    }
     int getRunLimit(){
         return runLimit;
     }
     int getSwimLimit(){
         return swimLimit;
     }
}
