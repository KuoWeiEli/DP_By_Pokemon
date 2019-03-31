package template;

/** 草原 **/
public class Grass extends Landform {
    @Override
    protected void loadScene() {
        System.out.println("載入草原地形");
    }

    @Override
    protected void loadMusic() {
        System.out.println("載入輕快悠然的背景音樂");
    }

    @Override
    protected void loadPokemons() {
        System.out.println("載入草原上的野生寶可夢");
    }
}
