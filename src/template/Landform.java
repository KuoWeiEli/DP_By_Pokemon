package template;

/** 地形 **/
public abstract class Landform {
    /** 載入地形（如草原、洞穴...） **/
    protected abstract void loadScene();
    /** 載入背景音樂 **/
    protected abstract void loadMusic();
    /** 載入該地形會出現的野生寶可夢 **/
    protected abstract void loadPokemons();

    /** 進入該地形 **/
    public void entry() {
        loadScene();
        loadMusic();
        loadPokemons();
    }
}
