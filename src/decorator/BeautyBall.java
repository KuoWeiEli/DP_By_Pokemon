package decorator;

/** 華麗球 **/
public class BeautyBall extends Ball {
    private Ball ball;

    public BeautyBall(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void gotcha() {
        if (null == ball) return;

        /** 在收服寶可夢前後均會放出華麗的特效 **/
        beauty();
        ball.gotcha();
        beauty();
    }

    /** 華麗特效 **/
    private void beauty() {
        System.out.println("散發七彩光芒！");
    }
}
