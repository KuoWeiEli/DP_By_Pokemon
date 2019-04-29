package visitor;
/** 女玩家 **/
public class GirlPlayer extends Player {
    public GirlPlayer(String name) {
        super(name);
    }

    @Override
    public void entryStroy(Story story) {
        story.ofGirl(this);
    }
}
