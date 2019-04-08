package mediator;

import java.util.ArrayList;
import java.util.List;

/** 聊天室 **/
public abstract class Chatroom {
    protected List<Member> channels = new ArrayList();
    protected List<Member> players = new ArrayList();

    /** 將頻道加入到聊天室裡 **/
    public void addChannel(Member channel) {
        this.channels.add(channel);
    }

    /** 將玩家加入到聊天室裡 **/
    public void addPlayer(Member player) {
        this.players.add(player);
    }

    /** 聊天室的主要功能，傳送訊息 **/
    public abstract void chat(String msg, Member channel, Member player);
}
