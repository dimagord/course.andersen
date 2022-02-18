import java.util.ArrayList;
import java.util.Arrays;

public class Box {
    private int totalWeight;
    private final ArrayList<Fruit> fruitList = new ArrayList<>();

    public Box(Apple... objs){
        fruitList.addAll(Arrays.asList(objs));
    }
    public Box(Orange... objs){
        fruitList.addAll(Arrays.asList(objs));
    }


    public void showItems() {
        for (Fruit fruit:fruitList){
        System.out.println("Тип T: " + fruit.getClass().getName());}
    }
    public int getWeight(){
        totalWeight=0;
        for (Fruit fruit:fruitList){
            totalWeight+=fruit.weight;
        } return totalWeight;
    }
    public void addFruits(Fruit... addedFruit){
        for (Fruit fruit:addedFruit){
        if (fruit.getClass().getName().equals(fruitList.get(0).getClass().getName())){
        fruitList.add(fruit);
        } else
            System.out.println(fruit.getClass().getName()+" can not be added into "+fruitList.get(0).getClass().getName()+" box");
        }

    }
    public boolean compare(Box box){
        return getWeight()== box.getWeight();
    }

    public void swap(Box box){
        if(!fruitList.get(0).getClass().getName().equals(box.fruitList.get(0).getClass().getName())){
            fruitList.clear();
        }
            fruitList.addAll(box.fruitList);
            box.fruitList.clear();

    }
    public int getFruitAmountInBox(){
        return fruitList.size();
    }

    public ArrayList<Fruit> getItems(){
        return fruitList;
    }

}
