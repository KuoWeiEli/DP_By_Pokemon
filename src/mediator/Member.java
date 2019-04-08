package mediator;

/** 聊天室物件 **/
public abstract class Member {
    /** 物件名稱 **/
    private String name;
    /** 每個聊天室物件都會參考到聊天室 **/
    protected Chatroom room;

    public Member(String name, Chatroom room) {
        this.name = name;
        this.room = room;
    }

    /**
     * @param msg 欲傳送訊息
     * @param channel 接收者所在頻道
     * @param player 接收者
     */
    public abstract void send(String msg, Member channel, Member player);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
