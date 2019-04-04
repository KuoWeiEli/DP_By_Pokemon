package iterator;

/** 走訪器模式 - 示範 **/
public class IteratorDemo {
    public static void main(String[] args) {
        /** 玩家將收服的寶可夢交給大木博士照顧 **/
        Aggregate drGarden = new DrGarden();
        drGarden.add("綠毛蟲");
        drGarden.add("傑尼龜");
        drGarden.add("皮卡丘");
        drGarden.add("小拳石");
        drGarden.add("走路草");
        drGarden.add("鯉魚王");
        drGarden.add("小拉達");

        /** 開啟寶可夢圖鑑，查看被照顧的寶可夢 **/
        Iterator pokedex = drGarden.createIterator();
        while (!pokedex.isEnd()) {
            System.out.println(pokedex.next());
        }
        System.out.println("圖鑑已預覽到底！再往上預覽寶可夢");
        System.out.println(pokedex.prev());
        System.out.println(pokedex.prev());
        System.out.println(pokedex.prev());
        System.out.println(pokedex.prev());
    }
}
