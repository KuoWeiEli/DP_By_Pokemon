package flyweight;

import java.util.Hashtable;

/** NPC 工廠 **/
public class NpcFactory {
    private static Hashtable<String, NPC> table = new Hashtable();
    public static String BATTLE = "B";
    public static String TALK = "T";

    /** 取得戰鬥 NPC **/
    public static NPC getBattleNPC(String name) {
        return getNpc(name, BATTLE);
    }
    /** 取得對話 NPC **/
    public static NPC getTalkNPC(String name) {
        return getNpc(name, TALK);
    }

    /** 依照給定種類 type 取得該 type 的 NPC **/
    private static NPC getNpc(String name, String type) {
        if (!table.containsKey(name))
            table.put(name, BATTLE.equals(type)? new BattleNPC(name): new TalkNPC(name));
        return table.get(name);
    }
}
