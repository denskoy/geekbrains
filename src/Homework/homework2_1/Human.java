package Homework.homework2_1;

public class Human implements RunableAndJumpable {
    private String name;
    private int runLength;
    private double jumpHeigth;

    public Human(String name, int runLength, double jumpHeigth) {
        this.name = name;
        this.runLength = runLength;
        this.jumpHeigth = jumpHeigth;
    }

    @Override
    public boolean run(RunTrack runTrack) {
        if (runLength >= runTrack.length) {
            System.out.println(this.name + " is running");
            return true;
        } else return false;
    }

    @Override
    public boolean jump(Wall wall) {
        if (jumpHeigth >= wall.getHeigth()) {
            System.out.println(this.name + " is jump");
            return true;
        } else return false;
    }
}
