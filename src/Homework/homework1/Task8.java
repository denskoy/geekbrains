package Homework.homework1;

public class Task8 {
    public static void main(String[] args) {
        highYear(2020);
        highYear(200);
        highYear(400);
        highYear(500);
    }

    public static void highYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }
}
