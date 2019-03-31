package bridge;

/** 橋梁模式 - 示範 **/
public class BridgeDemo {
    public static void main(String[] args) {
        Pokemon pokemon1 = new NormalPokemon("皮卡丘");
        pokemon1.setEvolution(new StoneEvolution());
        pokemon1.evolve();
        System.out.println("=> 皮卡丘透過電氣石進化成雷丘！");

        Pokemon pokemon2 = new NormalPokemon("傑尼龜");
        pokemon2.setEvolution(new NaturalEvolution());
        pokemon2.evolve();
        System.out.println("=> 傑尼龜自然進化成卡咪龜！");

        Pokemon pokemon3 = new NormalPokemon("豪力");
        pokemon3.setEvolution(new ExchangeEvolution());
        pokemon3.evolve();
        System.out.println("=> 豪力透過交換，進化成怪力！");
    }
}
