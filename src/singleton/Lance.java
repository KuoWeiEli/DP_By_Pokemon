package singleton;

/** 四大天王最後一位-龍系寶可夢的支配者 阿渡 **/
public class Lance {
    /** 擁有自身類別 **/
    private static Lance lance;

    /** 封閉建構子 **/
    private Lance() {}

    /** 與阿渡對戰 **/
    public static Lance meetLance() {
        /** Double check **/
        if (null == lance) {
            synchronized (Lance.class) {
                if (null == lance) {
                    lance = new Lance();
                }
            }
        }
        return lance;
    }

    /** 顯示戰鬥資訊 **/
    public void showBattleInfo() {
        System.out.println("阿渡，龍系寶可夢訓練家 ! 最強寶可夢為快龍! ");
    }
}
