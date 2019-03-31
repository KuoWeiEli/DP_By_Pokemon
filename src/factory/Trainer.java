package factory;

/** 訓練家 **/
public abstract class Trainer {
    /** 訓練家名字 **/
    protected String name;
    protected String getName() { return this.name; }
    protected void setName(String name) { this.name = name; }

    /** 擁有的寶可夢 **/
    protected String[] pokemons;
    protected String[] getPokemons() { return this.pokemons; }
    protected void setPokemons(String[] pokemons) { this.pokemons = pokemons; }

    /** 戰鬥資訊 **/
    protected abstract void battleInfo();
}
