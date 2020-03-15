package Homework.homework1;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(check(10, 20));
        System.out.println(check(5, 6));
    }

    public static boolean check(int a, int b) {
        int summ = a + b;
        return summ > 10 && summ <= 20;
    }
}
