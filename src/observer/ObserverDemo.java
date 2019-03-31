package observer;

/** 觀察者模式 - 示範  **/
public class ObserverDemo {
    public static void main(String[] args) {
        Center center = new LeagueCenter();

        /** 一個普通玩家，一個VIP玩家 **/
        new NormalPokemonMember(center, "小明");
        new VipPokemonMember(center, "小華");

        /** 中心發福利給每位會員 **/
        center.setBonus(10);
    }
}
