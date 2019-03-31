package observer;

/** 普通寶可夢玩家 **/
public class NormalPokemonMember extends Member {
    public NormalPokemonMember(Center center, String name) {
        super(center, name);
    }

    @Override
    public void receive() {
        System.out.printf("普通玩家%s取得中心發放的%s個寶貝球%n", this.name, this.center.getBonus());
    }
}
