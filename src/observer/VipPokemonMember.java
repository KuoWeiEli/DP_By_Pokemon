package observer;

/** VIP 寶可夢玩家，取得中心的資源是普通寶可夢玩家的兩倍 **/
public class VipPokemonMember extends Member {
    public VipPokemonMember(Center center, String name) {
        super(center, name);
    }
    @Override
    public void receive() {
        System.out.printf("VIP玩家%s取得中心發放的%s個寶貝球%n", this.name, this.center.getBonus() * 2);
    }
}
