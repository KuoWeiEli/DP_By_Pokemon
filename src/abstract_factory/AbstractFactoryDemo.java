package abstract_factory;

/** 抽象工廠模式-示範 **/
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        /** 遇到攻擊型的訓練家要求對戰 **/
        Trainer trainer = new AggressiveTrainer();
        System.out.println("Round1 - 攻擊型訓練家派出寶可夢");
        battle(trainer.assignFirePokemon(), "噴火龍");
        battle(trainer.assignWaterPokemon(), "毒刺水母");

        /** 遇到防禦型的訓練家要求對戰 **/
        trainer = new DefensiveTrainer();
        System.out.println("Round2 - 防禦型訓練家派出寶可夢");
        battle(trainer.assignFirePokemon(), "煤炭龜");
        battle(trainer.assignWaterPokemon(), "水箭龜");
    }

    /** 戰鬥 **/
    private static void battle(Pokemon pokemon, String name) {
        pokemon.setName(name);
        System.out.println(pokemon.getName() + "-" + pokemon.getProperty() + pokemon.getType());
    }
}
