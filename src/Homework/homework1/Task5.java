package Homework.homework1;

public class Task5 {
    public static void main(String[] args) {
        check(5);
        check(-2);
    }

    public static void check(int a) {
        if (a >= 0) {
            System.out.println(a + " - положительное число");
        } else {
            System.out.println(a + " - отрицательное число");
        }
    }
}
