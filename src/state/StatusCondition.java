package state;

/** 異常狀態 **/
public abstract class StatusCondition {
    /** 陷入狀態寶可夢會出現什麼反應 **/
    public abstract void react(Pokemon pokemon);
}
