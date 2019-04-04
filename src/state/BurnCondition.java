package state;

/** 灼傷狀態 **/
public class BurnCondition extends StatusCondition {
    @Override
    public void react(Pokemon pokemon) {
        if (pokemon.getStatusFlag() == 3) {
            System.out.println("寶可夢陷入灼傷狀態，防禦力減低並且減少 HP 5 點傷害！");
        }
    }
}
