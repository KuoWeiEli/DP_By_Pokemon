package flyweight;

/** 玩家 **/
public class Player {
    /** 名稱 **/
    private String name;
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
