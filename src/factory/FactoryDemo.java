package factory;

/** 工廠模式-示範 */
public class FactoryDemo {
    public static void main(String[] args) {
        /** 玩家來到了深灰市，挑戰深灰道館 **/
        Gym gym = new PewterGym();
        Trainer trainer = gym.assignTrainer();
        trainer.setName("小剛");
        trainer.setPokemons(new String[]{"小拳石", "大岩蛇"});
        trainer.battleInfo();

        /** 玩家來到了華藍市，挑戰華藍道館 **/
        gym = new CeruleanGym();
        trainer = gym.assignTrainer();
        trainer.setName("小霞");
        trainer.setPokemons(new String[]{"海星星", "蚊香蝌蚪", "可達鴉"});
        trainer.battleInfo();

        /** 玩家來到了枯葉市，挑戰枯葉道館 **/
        gym = new VermilionGym();
        trainer = gym.assignTrainer();
        trainer.setName("馬志士");
        trainer.setPokemons(new String[]{"小磁怪", "頑皮蛋", "雷丘", "三合一磁怪"});
        trainer.battleInfo();

    }
}
