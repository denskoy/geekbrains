package Homework.Homework2;

public class Task2 {
    public static void main(String[] args) {
        int[] mas2 = new int[8];
        for (int i = 1, j = 0; i < mas2.length; i++) mas2[i] = j += 3;
        for (int x : mas2) System.out.print(x + " ");
    }
}
