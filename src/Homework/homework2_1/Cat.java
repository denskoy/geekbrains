package Homework.homework2_1;

public class Cat implements RunableAndJumpable {
    private String nickname;
    private int runLength;
    private double jumpHeigth;

    public Cat(String nickname, int runLength, double jumpHeigth) {
        this.nickname = nickname;
        this.runLength = runLength;
        this.jumpHeigth = jumpHeigth;
    }

    @Override
    public boolean run(RunTrack runTrack) {
        if (runLength >= runTrack.length) {
            System.out.println(this.nickname + " is running");
            return true;
        } else return false;
    }

    @Override
    public boolean jump(Wall wall) {
        if (jumpHeigth >= wall.getHeigth()) {
            System.out.println(this.nickname + " is running");
            return true;
        } else return false;
    }
}
