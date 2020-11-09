package Homework.homework2_1;

public class Robot implements RunableAndJumpable{
    private String model;
    private int runLength;
    private double jumpHeigth;

    public Robot(String model, int i, double v) {
        this.model = model;
    }

    @Override
    public boolean run(RunTrack runTrack) {
        if (runLength >= runTrack.length) {
            System.out.println(this.model + " is running");
            return true;
        } else return false;
    }

    @Override
    public boolean jump(Wall wall) {
        if (jumpHeigth >= wall.getHeigth()) {
            System.out.println(this.model + " is running");
            return true;
        } else return false;
    }
}
