package builder;

import abstract_factory.Trainer;

/** 水屬性先上場 **/
public class WaterFirst implements BattleOrder {
    @Override
    public void assignOrder(Trainer trainer) {
        /** 先派出水屬性 **/
        System.out.println(trainer.assignWaterPokemon().getClass().getSimpleName());

        /** 再派出火屬性 **/
        System.out.println(trainer.assignFirePokemon().getClass().getSimpleName());
    }
}
