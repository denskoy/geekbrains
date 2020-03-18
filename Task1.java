package Homework2;

public class Task1 {
    public static void main(String[] args) {
        int[] mas1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i]==1){
                mas1[i]=0;
            }else mas1[i] =1;
            System.out.print(mas1[i] + " ");
        }
    }
}
