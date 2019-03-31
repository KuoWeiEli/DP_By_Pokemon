package builder;

import abstract_factory.AggressiveTrainer;
import abstract_factory.DefensiveTrainer;

/** 建造者模式 - 示範 **/
public class BuilderDemo {
    public static void main(String[] args) {
        System.out.println("第一個訓練家將優先派出水屬性寶可夢");
        BattleOrder order = new WaterFirst();
        order.assignOrder(new AggressiveTrainer());

        System.out.println("第二個訓練家將優先派出火屬性寶可夢");
        order = new FireFirst();
        order.assignOrder(new DefensiveTrainer());
    }
}
