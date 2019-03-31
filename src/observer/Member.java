package observer;

/** 會員 **/
public abstract class Member {
    /** 會員所屬中心 **/
    protected Center center;
    protected String name;

    public Member(Center center, String name) {
        this.name = name;
        this.center = center;
        this.center.add(this);
    }

    /** 接受公告 **/
    public abstract void receive();
}
