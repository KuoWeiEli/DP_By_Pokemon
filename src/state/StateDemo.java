package state;

/** 狀態模式 - 示範 **/
public class StateDemo {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        System.out.println("寶可夢受到催眠攻擊！陷入睡眠狀態...");
        pokemon.setStatusFlag(Flag.SLEEPY);
        pokemon.active();

        System.out.println("寶可夢遭受火焰攻擊！陷入灼傷狀態...");
        pokemon.setStatusFlag(Flag.BURN);
        pokemon.active();

        System.out.println("寶可夢遭受毒藥攻擊！陷入中毒狀態...");
        pokemon.setStatusFlag(Flag.POISON);
        pokemon.active();
    }
}
