package observer;

/** 中心 **/
public abstract class Center {
    /** 招收會員 **/
    public abstract void add(Member m);
    /** 剔除會員 **/
    public abstract void remove(Member m);
    /** 發放/取得福利 **/
    public abstract void setBonus(int count);
    public abstract int getBonus();
    /** 公告所有會員 **/
    public abstract void notifyAllMembers();
}
