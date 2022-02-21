public class Main {
    public static void main(String[] args) throws Throwable {
        String [][] array4x4WithChar = {
                {"5","7","3","16"},
                {"7","0","1","a"},
                {"8","1","3","3"},
                {"8","0","2","3"}};
        String [][] array2x4 = {
                {"5","7","3","16"},
                {"7","0","1","a"}};
        String [][] validArray4x4 = {
                {"5","7","3","16"},
                {"7","0","1","5"},
                {"8","1","3","3"},
                {"8","0","2","3"}};
        try{
            new TestArray(array2x4);
        } catch (MyArraysizeException ex){
            System.out.println(ex);
        }

        TestArray array = new TestArray(validArray4x4);
        System.out.println(array.sum());

        TestArray arrayWithChar = new TestArray(array4x4WithChar);
        try {
            System.out.println(arrayWithChar.sum());
        } catch (MyArrayDataException e){
            System.out.println(e);
        }
    }
}
