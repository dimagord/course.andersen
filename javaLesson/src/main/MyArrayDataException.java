public class MyArrayDataException extends Exception{
    public MyArrayDataException(int rowIndex,int columnIndex){
        super("Invalid value at "+rowIndex+" "+columnIndex);
    }
}
