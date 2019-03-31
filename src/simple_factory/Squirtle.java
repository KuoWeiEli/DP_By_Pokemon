package simple_factory;

/** 傑尼龜 **/
public class Squirtle extends Pokemon {
    @Override
    protected void showInfo() {
        System.out.println(this.getName() + "，水系寶可夢!");
    }
}
