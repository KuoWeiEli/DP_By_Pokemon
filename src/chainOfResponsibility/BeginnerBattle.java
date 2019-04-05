package chainOfResponsibility;

/** 初級對戰 **/
public class BeginnerBattle extends Battle {
    @Override
    public void match(Request request) {
        if (request.getScore() < 40) {
            System.out.println("載入街頭、空地等場景。");
            System.out.println("尋找初級的對手進行配對！");
        } else {
            if (getNextBattle() != null)
                getNextBattle().match(request);
        }
    }
}
