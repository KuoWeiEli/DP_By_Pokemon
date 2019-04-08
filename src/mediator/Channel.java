package mediator;

/** 頻道 **/
public class Channel extends Member {
    public Channel(String name, Chatroom room) {
        super(name, room);
        this.room.addChannel(this);
    }

    @Override
    public void send(String msg, Member channel, Member player) {
        /** 發送訊息到頻道上 **/
        this.room.chat(msg, channel, null);
    }
}
