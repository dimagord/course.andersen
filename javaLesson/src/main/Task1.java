public class Task1<T> {

    public void elementsSwap(T[] array, int index1, int index2){
        T temp=array[index2] ;
        array[index2] = array[index1];
        array[index1]=temp;

    }
}
