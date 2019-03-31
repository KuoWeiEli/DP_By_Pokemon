package abstract_factory;

/** 防禦型訓練家 **/
public class DefensiveTrainer implements Trainer {
    @Override // 返回水屬性防禦型的寶可夢
    public WaterPokemon assignWaterPokemon() { return new WaterDefensivePokemon(); }

    @Override // 返回火屬性防禦型的寶可夢
    public FirePokemon assignFirePokemon() { return new FireDefensivePokemon(); }
}
