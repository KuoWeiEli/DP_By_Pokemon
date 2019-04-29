package visitor;

/** 玩家 **/
public abstract class Player {
    private String name;
    public Player(String name) {
        this.name = name;
    }
    /** 進入劇情 **/
    public abstract void entryStroy(Story story);

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
