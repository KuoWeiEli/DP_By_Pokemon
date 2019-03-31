package facade;

/** 基本圖鑑 **/
public class BasicPokedex implements Pokedex {
    /** 地圖 **/
    private Map map = new KantoMap();
    /** 寶可夢 **/
    private Pokemon pokemon = new Pokemon();
    /** 聯盟中心 **/
    private LeagueCenter center = new LeagueCenter();

    public void setMap(Map map) {
        this.map = map;
    }
    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    public void setCenter(LeagueCenter center) {
        this.center = center;
    }

    @Override
    public void showPokemonOnMap() {
        /** 顯示地圖 **/
        map.showMap();
        /** 取得寶可夢 **/
        pokemon.getPokemon();
        /** 取得寶可夢的位置 **/
        center.getPokemonLocation();
        /** 標記在地圖上 **/
        map.markPosition();
    }

    @Override
    public void requirePokemonDetail() {
        /** 取得寶可夢 **/
        pokemon.getPokemon();
        /** 聯盟中心尋找資料，並返回查到的詳細資料 **/
        center.queryFromLibrary();
        center.getPokemonDetail();
        /** 查詢寶可夢的出現地方相關資訊 **/
        map.getRegionInfo();
        /** 最後顯示寶可夢的詳細資料 **/
        pokemon.showDetail();
    }
}

