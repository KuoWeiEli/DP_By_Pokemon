package state;

/** 睡眠狀態 **/
public class SleepyCondition extends StatusCondition {
    @Override
    public void react(Pokemon pokemon) {
        if (pokemon.getStatusFlag() == 1) {
            System.out.println("寶可夢陷入睡眠狀態，正在深深的沉睡中，無法動作！");
        } else {
            pokemon.setStatus(new PoisonCondition());
            pokemon.getStatus().react(pokemon);
        }
    }
}
