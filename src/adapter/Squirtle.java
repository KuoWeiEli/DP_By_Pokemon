package adapter;

/** 傑尼龜可以透過秘傳機器學習到衝浪技能 **/
public class Squirtle implements Surf {
    @Override
    public void surf() {
        System.out.printf("%s悠游在海面上~~%n", this.getClass().getSimpleName());
    }
}
