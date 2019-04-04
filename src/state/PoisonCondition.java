package state;

/** 中毒狀態 **/
public class PoisonCondition extends StatusCondition {
    @Override
    public void react(Pokemon pokemon) {
        if (pokemon.getStatusFlag() == 2) {
            System.out.println("寶可夢陷入中毒狀態，造成 HP 損失 20 點！");
        } else {
            pokemon.setStatus(new BurnCondition());
            pokemon.getStatus().react(pokemon);
        }
    }
}
