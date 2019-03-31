package builder;

import abstract_factory.Trainer;

/** 火屬性先上場 **/
public class FireFirst implements BattleOrder {
    @Override
    public void assignOrder(Trainer trainer) {
        /** 先派出火屬性 **/
        System.out.println(trainer.assignFirePokemon().getClass().getSimpleName());

        /** 再派出水屬性 **/
        System.out.println(trainer.assignWaterPokemon().getClass().getSimpleName());
    }
}
