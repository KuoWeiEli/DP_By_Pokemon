package prototype;

/** 護士 **/
public class Nurse implements Cloneable {
    /** 姓名 **/
    private String name;
    /** 特徵 **/
    private String features;
    /** 工作地點 **/
    private Location workLocation;
    public Nurse(String name, String features) {
        this.name = name;
        this.features = features;
    }
    /** 設置工作地點 **/
    public void setWorkLocation(Location location) { this.workLocation = location; }

    /** 設定工作地點名稱 **/
    public void setWorkLocationName(String name) {
        this.workLocation.setName(name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        /** 先複製nurse所擁有基本型別的資料 **/
        Nurse nurse = (Nurse) super.clone();
        /** 參考型別的資料必須額外複製 **/
        nurse.workLocation = (Location) workLocation.clone();
        return nurse;
    }

    @Override
    public String toString() {
        return String.format("我是%s的護士%s，請問需要幫助嗎?", this.workLocation, this.name);
    }
}
