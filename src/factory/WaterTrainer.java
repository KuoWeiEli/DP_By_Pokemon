package factory;

import java.util.Arrays;

/** 水系寶可夢訓練家 **/
public class WaterTrainer extends Trainer {
    @Override
    protected void battleInfo() {
        System.out.println(this.getName() + "穿著比基尼亮麗登場 ❤❤"
                + " 對戰寶可夢為:" + Arrays.toString(this.getPokemons()));
    }
}
