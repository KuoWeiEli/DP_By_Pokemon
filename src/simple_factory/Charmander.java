package simple_factory;

/** 小火龍 **/
public class Charmander extends Pokemon {
    @Override
    protected void showInfo() {
        System.out.println(this.getName() + "，火系寶可夢!");
    }
}
