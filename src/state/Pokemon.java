package state;

/** 寶可夢 **/
public class Pokemon {
    /** 寶可夢的異常狀態 **/
    private StatusCondition status;

    /** 異常狀態值 **/
    private int statusFlag;

    /** 行動 **/
    public void active() {
        System.out.println("輪到自己回合了！");
        setStatus(new NormalCondition());
        stateHappened();
    }

    /** 狀態開始 **/
    public void stateHappened() {
        status.react(this);
    }

    public StatusCondition getStatus() {
        return status;
    }

    public void setStatus(StatusCondition status) {
        this.status = status;
    }

    public int getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(int statusFlag) {
        this.statusFlag = statusFlag;
    }
}
