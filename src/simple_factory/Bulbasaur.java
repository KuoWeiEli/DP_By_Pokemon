package simple_factory;

/** 妙蛙種子 **/
public class Bulbasaur extends Pokemon {
    @Override
    protected void showInfo() {
        System.out.println(this.getName() + "，草系寶可夢!");
    }
}
