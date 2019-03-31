package bridge;

/** 使用特殊石頭來進化寶可夢 **/
public class StoneEvolution implements Evolution {
    @Override
    public void evolve(Pokemon pokemon) {
        System.out.printf("對%s使用石頭%n", pokemon.getName());
    }
}
