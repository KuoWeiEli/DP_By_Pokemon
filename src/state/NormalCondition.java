package state;

/** 沒有陷入異常狀態 **/
public class NormalCondition extends StatusCondition {
    @Override
    public void react(Pokemon pokemon) {
        if (pokemon.getStatusFlag() < 1) {
            System.out.println("寶可夢沒有陷入任何異常狀態！");
        } else {
            pokemon.setStatus(new SleepyCondition());
            pokemon.getStatus().react(pokemon);
        }
    }
}
