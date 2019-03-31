package composite;

/** 合成模式 - 示範 **/
public class CompositeDemo {
    public static void main(String[] args) {
        /***************************角色設定並組織成員***************************/
        /** 火箭隊老大 **/
        Rocket boss = new Organization("坂木", "超夢");
        /** 老大旁的左右手 **/
        Rocket assistant = new Team("真島", "火焰鳥");
        /** 火箭隊深灰分部 **/
        Rocket pewter = new Organization("深灰分部", "急凍鳥");
        /** 深灰分部-菜鳥隊 **/
        Rocket newcomer = new Team("菜鳥隊", "綠毛蟲");
        /** 三人小組-武藏、小次郎、喵喵 **/
        Rocket triple = new Team("武藏、小次郎、喵喵", "皮卡丘");

        boss.add(assistant);
        boss.add(pewter);
        pewter.add(newcomer);
        pewter.add(triple);

        System.out.println("\n開始行動");
        boss.action();

        System.out.println("\n顯示組織架構");
        boss.display(0);

        System.out.println("\n菜鳥隊考績不合格，被深灰分部汰除");
        pewter.remove(newcomer);

        System.out.println("\n老大再次下令行動");
        boss.action();
    }
}
