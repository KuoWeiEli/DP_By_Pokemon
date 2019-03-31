package proxy;

import java.util.ArrayList;
import java.util.List;

/** 寶可夢保管員 **/
public class PokemonCaretaker implements Caretaker {
    private List<Pokemon> pokemons = new ArrayList();

    @Override
    public Pokemon get(Pokemon pokemon) {
        if (pokemons.contains(pokemon))
            return pokemons.get(pokemons.indexOf(pokemon));
        else return null;
    }

    @Override
    public void put(Pokemon pokemon) { pokemons.add(pokemon); }

    @Override
    public void remove(Pokemon pokemon) { pokemons.remove(pokemon); }
}
