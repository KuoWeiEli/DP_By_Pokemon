package visitor;

/** 比賽劇情 **/
public class MatchStory implements Story {
    @Override
    public void ofBoy(BoyPlayer boyPlayer) {
        System.out.printf("%s玩家將參加格鬥大賽！%n", boyPlayer.getName());
    }

    @Override
    public void ofGirl(GirlPlayer girlPlayer) {
        System.out.printf("%s玩家將參加華麗大賽！%n", girlPlayer.getName());
    }
}
