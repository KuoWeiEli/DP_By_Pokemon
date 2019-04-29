package visitor;

/** 對手劇情 **/
public class OpponentStory implements Story {
    @Override
    public void ofBoy(BoyPlayer boyPlayer) {
        System.out.printf("%s玩家在前往深灰市的途中遇到勁敵小茂！%n", boyPlayer.getName());
    }

    @Override
    public void ofGirl(GirlPlayer girlPlayer) {
        System.out.printf("%s玩家在華藍市的噴水池前遇到閨密小玲！%n", girlPlayer.getName());
    }
}
