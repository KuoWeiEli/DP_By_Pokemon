package bridge;

/** 透過與其他玩家交換寶可夢，以讓交換的寶可夢進化 **/
public class ExchangeEvolution implements Evolution {
    @Override
    public void evolve(Pokemon pokemon) {
        System.out.printf("與其他玩家交換%s%n", pokemon.getName());
    }
}
