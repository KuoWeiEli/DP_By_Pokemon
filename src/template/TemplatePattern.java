package template;

/** 樣板模式 - 示範 **/
public class TemplatePattern {
    public static void main(String[] args) {
        System.out.println("==> 玩家準備進入草原");
        Landform landform = new Grass();
        landform.entry();

        System.out.println("==> 玩家看見了一個洞穴，準備進入探險");
        landform = new Cave();
        landform.entry();
    }
}
