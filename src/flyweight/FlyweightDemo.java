package flyweight;

/** 享元模式 - 示範 **/
public class FlyweightDemo {
    public static void main(String[] args) {
        Player player = new Player("Red");

        /** 玩家遇到了對戰 NPC **/
        NPC battleNpc = NpcFactory.getBattleNPC("江川");
        battleNpc.interact(player);

        /** 玩家遇到了對話 NPC **/
        NPC talkNpc = NpcFactory.getTalkNPC("明美");
        talkNpc.interact(player);

        /** 其他玩家在不同的時間點遇到了明美 **/
        String[] players = new String[]{"Blue", "Yello", "Black", "White"};
        for (String each: players) {
            NPC anotherTalkNpc = NpcFactory.getTalkNPC("明美");
            anotherTalkNpc.interact(new Player(each));
            System.out.println("明美的 ID：" + anotherTalkNpc.toString());
        }
    }
}
