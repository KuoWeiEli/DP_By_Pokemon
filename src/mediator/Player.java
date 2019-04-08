package mediator;

/** 玩家 **/
public class Player extends Member {
    public Player(String name, Chatroom room) {
        super(name, room);
        room.addPlayer(this);
    }

    @Override
    public void send(String msg, Member channel, Member player) {
        room.chat(msg, channel, player);
    }
}
