package command;

/** 治療灼傷請求 **/
public class HealBurnRequest extends HealRequest {
    public HealBurnRequest(MachineHealer healer) {
        super(healer);
    }

    @Override
    public void heal() {
        this.healer.healBurnStatus();
    }

    @Override
    public String toString() {
        return "治療灼傷";
    }
}
