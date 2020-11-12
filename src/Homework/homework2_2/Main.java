package Homework.homework2_2;

public class Main {
    private static final int sizeArray = 4;

    public static int summ(String[][] testArray) throws MySizeException {
        if (testArray.length != sizeArray) {
            throw new MySizeException();
        }
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i].length != 4) {
                throw new MySizeException();
            }
        }
        int summ = 0;
        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray.length; j++) {
                try {
                    summ += Integer.parseInt(testArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }
        }
        return summ;
    }

    public static void main(String[] args) {
        String[][] testArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3a", "4"},
                {"1", "2", "3", "4"},

        };
        try {
            System.out.println(summ(testArray));
        }catch (MySizeException e){
            e.printMessage();
        }catch (MyArrayDataException e){
            e.printMessage();
        }
    }
}
