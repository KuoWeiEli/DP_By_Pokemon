package template;

/** 洞穴 **/
public class Cave extends Landform {
    @Override
    protected void loadScene() {
        System.out.println("載入洞穴地形");
    }

    @Override
    protected void loadMusic() {
        System.out.println("載入沉悶詭譎的背景音樂");
    }

    @Override
    protected void loadPokemons() {
        System.out.println("載入洞穴中的野生寶可夢");
    }
}
