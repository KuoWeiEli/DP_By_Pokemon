package abstract_factory;

/** 訓練家 **/
public interface Trainer {
    /** 派出水系寶可夢 **/
    WaterPokemon assignWaterPokemon();
    /** 派出火系寶可夢 **/
    FirePokemon assignFirePokemon();
}
