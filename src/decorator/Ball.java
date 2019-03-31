package decorator;

/** 用來收服寶可夢的小型球體 **/
public abstract class Ball {

    /** 往想要收服的寶可夢方向丟擲 **/
    public void cast() {
        System.out.println("丟擲出去！");
        gotcha();
    }

    /** 收服寶可夢方法 **/
    public abstract void gotcha ();
}
