package proxy;

/** 健康中心的電腦 **/
public class Computer implements Caretaker {
    /** 代理寶可夢管理員 **/
    private PokemonCaretaker caretaker = new PokemonCaretaker();

    @Override
    public Pokemon get(Pokemon pokemon) {
        Pokemon checkPokemon = caretaker.get(pokemon);
        if (checkPokemon != null) {
            System.out.printf("已成功取得%s寶可夢!%n", checkPokemon.getName());
            return checkPokemon;
        } else {
            System.out.printf("您並沒有將%s寶可夢交給管理員保管!%n", pokemon.getName());
            return null;
        }
    }

    @Override
    public void put(Pokemon pokemon) {
        if (pokemon == null) System.out.println("請選擇需要寄放的寶可夢!");
        else {
            caretaker.put(pokemon);
            System.out.printf("%s寶可夢已順利交給管理員!%n", pokemon.getName());
        }
    }

    @Override
    public void remove(Pokemon pokemon) {
        if (pokemon == null) System.out.println("請選擇需要放生的寶可夢!");
        else {
            caretaker.remove(pokemon);
            System.out.printf("%s寶可夢已順利放生!%n", pokemon.getName());
        }
    }
}
