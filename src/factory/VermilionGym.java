package factory;

/** 枯葉道館，對戰寶可夢其屬性為電屬性，道館館主為馬志士，玩家獲勝之後可以獲得橙色徽章 **/
public class VermilionGym implements Gym {
    @Override
    public Trainer assignTrainer() {
        return new ElectricTrainer();
    }
}
