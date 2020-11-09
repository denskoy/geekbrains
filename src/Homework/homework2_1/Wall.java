package Homework.homework2_1;

public class Wall implements Do {
    private double heigth;

    public double getHeigth() {
        return heigth;
    }

    public Wall(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public void doIt(RunableAndJumpable runableAndJumpable) {
                runableAndJumpable.jump(this);
            if (runableAndJumpable.jump(this)) {
                System.out.println("Jump Success");
            } else {
                System.out.println("Not jump");
            }
        }
    }

