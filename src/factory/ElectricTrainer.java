package factory;

import java.util.Arrays;

/** 電系寶可夢訓練家 **/
public class ElectricTrainer extends Trainer {
    @Override
    protected void battleInfo() {
        System.out.println(this.getName() + "穿著橡膠裝閃電登場 ⚡⚡⚡"
                + " 對戰寶可夢為:" + Arrays.toString(this.getPokemons()));
    }
}
