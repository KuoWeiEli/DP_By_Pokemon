package facade;

/** 表象 (外觀) 模式 - 示範 **/
public class FacadeDemo {
    public static void main(String[] args) {
        /** 玩家擁有一個圖鑑 **/
        Pokedex pokedex = new BasicPokedex();

        System.out.println("玩家打開地圖");
        pokedex.showPokemonOnMap();
        System.out.println();

        System.out.println("玩家想要看寶可夢詳細資料");
        pokedex.requirePokemonDetail();
        System.out.println();

        /** 玩家到了城都地區，將圖鑑的地圖替換為城都地區的地圖 **/
        ((BasicPokedex) pokedex).setMap(new JohtoMap());
        System.out.println("玩家打開地圖");
        pokedex.showPokemonOnMap();
    }
}
