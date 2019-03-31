package facade;

/** 關都地區的地圖 **/
public class KantoMap implements Map {
    @Override
    public void showMap() { System.out.println("顯示關都地區的地圖"); }

    @Override
    public void markPosition() {
        System.out.println("在關都地區標註位置");
    }

    @Override
    public void getRegionInfo() { System.out.println("取得關都地區資料"); }
}
