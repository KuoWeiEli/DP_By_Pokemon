package command;

/** 治療請求 **/
public abstract class HealRequest {
    protected MachineHealer healer;

    public HealRequest(MachineHealer healer) {
        this.healer = healer;
    }

    /** 治療 **/
    public abstract void heal();
}
