package Homework2;

public class Task5 {
    public static void main(String[] args) {
        int[] mas5 = {10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = mas5[0], max = mas5[0];
        for (int i = 0; i < mas5.length; i++) {
            if (mas5[i] > max) {
                max = mas5[i];
            }
            if (mas5[i] < min) {
                min = mas5[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
