

public class Main {
    public static void main(String[] args) {
        Cat murka = new Cat("Murka", 10);
        murka.swim(200, murka.swimLimit);
        murka.run(100, murka.swimLimit);

        Dog bobik = new Dog("Bobik");
        bobik.run(10, bobik.runLimit);
        bobik.swim(10, bobik.swimLimit);




        Cat[] cats = {new Cat("Chernush",50), new Cat("Markiz", 10), new Cat("Polosatuy",70)};
        Plate plate = new Plate(100);
        for (Cat cat:cats){
            cat.eat(plate);
            cat.info();
        }
        bobik.getDogsCount();
        murka.getCatsCount();
        murka.getAnimalsCount();
    }
}
