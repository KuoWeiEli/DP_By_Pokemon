package iterator;

import java.util.Arrays;

/** 大木博士的花園 **/
public class DrGarden extends Aggregate {
    /** 託管的寶可夢們 **/
    private Object[] pokemons;
    /** 寶可夢活動的位置 **/
    private int position = 0;

    public DrGarden() {
        /** 大木博士的花園裡目前可以讓六個寶可夢活動 **/
        pokemons = new Object[6];
    }

    @Override
    public Iterator createIterator() {
        return new Pokedex(pokemons);
    }

    @Override
    public void add(Object pokemon) {
        /** 如果花園裡已塞滿了寶可夢，那就要擴建花園以擁有更多的位置 **/
        if (position >= pokemons.length) {
            pokemons = Arrays.copyOf(pokemons, pokemons.length + 1);
        }
        pokemons[position++] = pokemon;
    }
}
