import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private int totalWeight;
    private final ArrayList<T> fruitList = new ArrayList<>();

    public Box(T... objs){
        if (objs.length>1){
            for(T obj:objs){
                assert objs[0].getClass().getName().equals(obj.getClass().getName());
            }
        }
        fruitList.addAll(Arrays.asList(objs));
    }



    public void showItems() {
        for (T fruit:fruitList){
        System.out.println("Тип T: " + fruit.getClass().getName());}
    }
    public int getWeight(){
        totalWeight=0;
        for (T fruit:fruitList){
            totalWeight+=fruit.weight;
        } return totalWeight;
    }
    public void addFruits(T... addedFruit){
        for (T fruit:addedFruit){
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

    public ArrayList<T> getItems(){
        return fruitList;
    }

}
