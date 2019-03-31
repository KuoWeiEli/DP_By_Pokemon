package bridge;

/** 寶可夢達到一定等級後自然進化 **/
public class NaturalEvolution implements Evolution {
    @Override
    public void evolve(Pokemon pokemon) {
        System.out.printf("%s達到一定等級%n", pokemon.getName());
    }
}
