package abstract_factory;

/** 水屬性防禦型寶可夢 **/
public class WaterDefensivePokemon extends WaterPokemon {
    @Override
    protected String getType() {
        return "防禦型";
    }
}
