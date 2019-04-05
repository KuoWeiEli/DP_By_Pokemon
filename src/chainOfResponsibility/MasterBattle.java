package chainOfResponsibility;

/** 大師對戰 **/
public class MasterBattle extends Battle {
    @Override
    public void match(Request request) {
        if (request.getScore() <= 99) {
            System.out.println("載入聯盟比賽場地。");
            System.out.println("與大師等級的對手進行配對！");
        } else {
            System.out.println("恭喜！您已是全聯盟最強的訓練家！");
        }
    }
}
