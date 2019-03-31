package singleton;

/** 單例模式 - 示範 **/
public class SingletonDemo {
    public static void main(String[] args) {
        /** 與阿渡對決 **/
        Lance lance = Lance.meetLance();
        lance.showBattleInfo();
        /** 多執行緒測試 **/
        System.out.println("\n多名玩家要求跟阿渡對戰!");
        askBattle();
        askBattle();
        askBattle();
        askBattle();
        askBattle();
    }

    /** 要求對戰 **/
    private static void askBattle() {
        new Thread() {
            @Override
            public void run() {
                System.out.println(Lance.meetLance());
            }
        }.start();
    }
}


