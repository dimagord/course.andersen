public class TestArray{
    private String[][] arrays;
    private int totalSum;

    TestArray(String[][] arrays) throws Throwable {
        this.arrays=arrays;
        if (arrays.length!=4){
            throw new MyArraysizeException();
        }
        for (String[] array:arrays){
            if (array.length!=4){
                throw new MyArraysizeException();
            }
        }

    }
    public int sum() throws MyArrayDataException {
        for (int i=0;i<arrays.length;i++){
            for (int j=0;j<arrays[i].length;j++){
                try {
                    totalSum+=Integer.parseInt(arrays[i][j]);
                } catch (NumberFormatException ex){
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return totalSum;
    }
}
