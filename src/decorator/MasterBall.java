package decorator;

/** 大師球 **/
public class MasterBall extends Ball {
    private Ball ball;

    public MasterBall(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void gotcha() {
        if (null == ball) return;

        /** 額外增加大師球的功能 **/
        System.out.println("大師球 100% ");
        ball.gotcha();
    }
}
