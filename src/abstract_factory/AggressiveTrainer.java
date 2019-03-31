package abstract_factory;

/** 攻擊型訓練家 **/
public class AggressiveTrainer implements Trainer {
    @Override // 返回水屬性攻擊型的寶可夢
    public WaterPokemon assignWaterPokemon() { return new WaterAggressivePokemon(); }

    @Override // 返回火屬性攻擊型的寶可夢
    public FirePokemon assignFirePokemon() {
        return new FireAggressivePokemon();
    }
}


