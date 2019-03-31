package command;

/** 治療睡眠請求 **/
public class HealSleepRequest extends HealRequest {
    public HealSleepRequest(MachineHealer healer) {
        super(healer);
    }

    @Override
    public void heal() {
        this.healer.healSleepStatus();
    }

    @Override
    public String toString() {
        return "治療睡眠";
    }
}
