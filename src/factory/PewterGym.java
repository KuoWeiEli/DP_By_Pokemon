package factory;

/** 深灰道館，對戰寶可夢其屬性為岩石屬性，道館館主為小剛，玩家獲勝之後可以獲得灰色徽章 **/
public class PewterGym implements Gym {
    @Override
    public Trainer assignTrainer() {
        return new RockTrainer();
    }
}
