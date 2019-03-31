package factory;

import java.util.Arrays;

/** 岩系寶可夢訓練家 **/
public class RockTrainer extends Trainer {
    @Override
    protected void battleInfo() {
        System.out.println(this.getName() + "穿著登山裝自信登場!"
            + "對戰寶可夢為:" + Arrays.toString(this.getPokemons()));
    }
}
