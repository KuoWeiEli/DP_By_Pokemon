package abstract_factory;

/** 水屬性攻擊型寶可夢 **/
public class WaterAggressivePokemon extends WaterPokemon {
    @Override
    protected String getType() { return "攻擊型"; }
}
