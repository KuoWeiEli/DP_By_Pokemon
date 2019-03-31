package facade;

/** 圖鑑介面，定義一些使用者可操作的動作 **/
public interface Pokedex {
    /** 在地圖上顯示寶可夢位置 **/
    void showPokemonOnMap();

    /** 查詢寶可夢詳細資訊 **/
    void requirePokemonDetail();
}
