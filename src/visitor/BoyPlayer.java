package visitor;

/** 男玩家 **/
public class BoyPlayer extends Player {
    public BoyPlayer(String name) {
        super(name);
    }

    @Override
    public void entryStroy(Story story) {
        story.ofBoy(this);
    }
}
