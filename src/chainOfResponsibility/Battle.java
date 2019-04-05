package chainOfResponsibility;

/** 對戰 **/
public abstract class Battle {
    /** 下一等級對戰 **/
    private Battle nextBattle;
    /** 配對 **/
    public abstract void match(Request request);

    public Battle getNextBattle() {
        return nextBattle;
    }

    /** 這邊返回下一級對戰物件，方便可以使用 Chain method 方式設定 **/
    public Battle setNextBattle(Battle battle) {
        this.nextBattle = battle;
        return this.nextBattle;
    }
}
