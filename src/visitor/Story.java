package visitor;

/** 劇情 **/
public interface Story {
    /** 男生劇情 **/
    void ofBoy(BoyPlayer boyPlayer);
    /** 女生劇情 **/
    void ofGirl(GirlPlayer girlPlayer);
}
