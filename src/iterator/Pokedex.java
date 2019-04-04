package iterator;

/** 寶可夢圖鑑 **/
public class Pokedex implements Iterator {
    /** 在大木博士花園裡快活的寶可夢們 **/
    private Object[] pokemons;
    /** 使用者目前所瀏覽的位置 **/
    private int index = 0;

    public Pokedex(Object[] pokemonsInGarden) {
        pokemons = pokemonsInGarden;
    }

    @Override
    public Object prev() {
        try {
            return pokemons[--index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("到頂了！無寶可夢可選擇查看！");
            ++index;
        }
        return null;
    }

    @Override
    public Object next() {
        try {
            return pokemons[index++];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("到底了！無寶可夢可選擇查看！");
            --index;
        }
        return null;
    }

    @Override
    public boolean isEnd() {
        return index >= pokemons.length-1;
    }
}
