package prototype;

/** 地點 **/
public class Location implements Cloneable {
    /** 名稱 **/
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public Location(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
