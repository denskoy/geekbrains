package Homework.homework2_1;

public class Main {
    public static void main(String[] args) {
        RunableAndJumpable[] moves = new RunableAndJumpable[3];
        moves[0] = new Human("Fred", 1000, 1.5);
        moves[1] = new Cat("Barsik", 2000, 1);
        moves[2] = new Robot("R2D2", 500, 0.5);

        Do[] dos = new Do[3];
        dos[0] = new RunTrack( 300);
        dos[1] = new Wall(0.3);
        dos[2] = new RunTrack(200);

        for (RunableAndJumpable m : moves){
            for (Do d : dos){
                d.doIt(m);
            }
        }
    }
}
