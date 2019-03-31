package factory;

/** 華藍道館，對戰寶可夢其屬性為水屬性，道館館主為小霞，玩家獲勝之後可以獲得藍色徽章**/
public class CeruleanGym implements Gym {
    @Override
    public Trainer assignTrainer() {
        return new WaterTrainer();
    }
}
