package flyweight;

/** 對戰 NPC **/
public class BattleNPC extends NPC {
    public BattleNPC(String name) {
        setName(name);
    }
    @Override
    public void interact(Player player) {
        System.out.printf("NPC %s 要求與玩家 %s 進行戰鬥！%n", getName(), player.getName());
    }
}
