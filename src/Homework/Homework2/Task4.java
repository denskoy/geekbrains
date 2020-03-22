package Homework.Homework2;

public class Task4 {
    public static void main(String[] args) {
        int[][] mas4 = new int[5][5];
        for (int i = 0; i < mas4.length; i++) {
            for (int j = 0; j < mas4[i].length; j++) {
                if (i == j || i == (mas4.length - 1 - j)) mas4[i][j] = 1;
                System.out.print(mas4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
