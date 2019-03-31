package composite;

/** 火箭隊 **/
public abstract class Rocket {
    /** 名稱 **/
    protected String name;
    /** 目標 **/
    protected String target;
    public Rocket(String name, String target) {
        this.name = name;
        this.target = target;
    }
    /** 加入組織 **/
    public abstract void add(Rocket rocket);
    /** 退出組織 **/
    public abstract void remove(Rocket rocket);
    /** 行動 **/
    public abstract void action();
    /** 顯示組織架構圖 **/
    public abstract void display(int level);
}

