package facade;

/** 城都地區地圖 **/
public class JohtoMap implements Map {
    @Override
    public void showMap() {
        System.out.println("顯示城都地區的地圖");
    }

    @Override
    public void markPosition() {
        System.out.println("在城都地區標註位置");
    }

    @Override
    public void getRegionInfo() {
        System.out.println("取得城都地區資料");
    }
}
