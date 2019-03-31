package decorator;

/** 普通寶貝球 **/
public class PokeBall extends Ball {

    @Override
    public void gotcha() {
        System.out.println("收服了寶可夢！");
    }
}
