package command;

/** 治療中毒請求 **/
public class HealPoisonRequest extends HealRequest {
    public HealPoisonRequest(MachineHealer healer) {
        super(healer);
    }

    @Override
    public void heal() {
        this.healer.healPoisonStatus();
    }

    @Override
    public String toString() {
        return "治療中毒";
    }
}
