package flyweight;

/** 對話 NPC **/
public class TalkNPC extends NPC {
    public TalkNPC(String name) {
        setName(name);
    }
    @Override
    public void interact(Player player) {
        System.out.printf("NPC %s 與玩家 %s 進行對話！%n", getName(), player.getName());
    }
}
