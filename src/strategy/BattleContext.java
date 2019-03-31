package strategy;

/**
 * 戰鬥介面
 **/
public class BattleContext {
    /**
     * 操作參數
     **/
    public static int COMBAT = 1;           // 戰鬥
    public static int USE_ITEM = 2;         // 使用道具
    public static int CHANGE_POKEMON = 3;   // 更換寶可夢
    public static int ESCAPE = 4;           // 逃跑

    private BattleAction action;

    /**
     * 玩家選擇特定操作
     **/
    public BattleContext setAction(int battleCode) throws Exception {
        switch (battleCode) {
            case 1:
                this.action = new CombatAction();
                break;
            case 2:
                this.action = new UseItemAction();
                break;
            case 3:
                this.action = new ChangePokemonAction();
                break;
            case 4:
                this.action = new EscapeAction();
                break;
            default:
                throw new Exception("未選擇操作！");
        }
        return this;
    }

    /**
     * 戰鬥介面執行操作
     **/
    public void operation() {
        if (this.action == null) return;
        this.action.action();
    }
}
