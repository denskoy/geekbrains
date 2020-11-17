package Homework.homework2_1;

public class RunTrack implements Do {
        int length;

    public RunTrack( int length) {

        this.length = length;

    }

    @Override
    public void doIt(RunableAndJumpable runableAndJumpable) {
        runableAndJumpable.run(this);
        if(runableAndJumpable.run(this)){

            System.out.println("Run Success");
        }else {
            System.out.println("Not run");
        }
    }
}
