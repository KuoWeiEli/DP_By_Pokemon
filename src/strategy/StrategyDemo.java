package strategy;

/** 策略模式 - 示範 **/
public class StrategyDemo {
    public static void main(String[] args) throws Exception {
        /** 玩家遇到野生的超夢，進入戰鬥介面 **/
        BattleContext context = new BattleContext();
        /** 玩家選擇寶可夢進行戰鬥 **/
        context.setAction(BattleContext.COMBAT).operation();
        /** 寶可夢快沒血了，換下一隻 **/
        context.setAction(BattleContext.CHANGE_POKEMON).operation();
        /** 完了，沒寶可夢可換了，趕快道具補血 **/
        context.setAction(BattleContext.USE_ITEM).operation();
        /** 糟糕，道具也沒了，趕快逃跑 **/
        context.setAction(BattleContext.ESCAPE).operation();
        /** 竟然不給我逃，他X&#*$(，激動得不小心讓電動玩具從手中滑落掉到地上 **/
        context.setAction(58398902).operation();
    }
}
