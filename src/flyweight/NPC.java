package flyweight;

/** 非玩家角色 **/
public abstract class NPC {
    /** 名字 **/
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** 互動邏輯 **/
    public abstract void interact(Player player);
}
