package visitor;

/** 訪問者模式 - 示範 **/
public class VisitorDemo {
    public static void main(String[] args) {
        Player boy = new BoyPlayer("小明");
        Player girl = new GirlPlayer("小美");
        /** 勁敵劇情 **/
        OpponentStory oStory = new OpponentStory();
        boy.entryStroy(oStory);
        girl.entryStroy(oStory);
        /** 比賽劇情 **/
        MatchStory mStory = new MatchStory();
        boy.entryStroy(mStory);
        girl.entryStroy(mStory);
    }
}
