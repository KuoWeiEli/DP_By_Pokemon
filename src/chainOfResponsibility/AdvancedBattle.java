package chainOfResponsibility;

/** 進階對戰 **/
public class AdvancedBattle extends Battle {
    @Override
    public void match(Request request) {
        if (request.getScore() < 80) {
            System.out.println("載入道館等場所。");
            System.out.println("尋找高手進行配對中！");
        } else {
            if (getNextBattle() != null)
                getNextBattle().match(request);
        }
    }
}
