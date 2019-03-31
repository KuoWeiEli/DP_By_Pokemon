package prototype;

/** 原型模式-示範 **/
public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        /** 玩家每抵達一個城鎮，都會去寶可夢中心拜託喬伊治療寶可夢 **/
        Nurse nurse = new Nurse("喬伊", "紅色捲髮");

        /** 到了第一個城鎮 - 深灰市 **/
        nurse.setWorkLocation(new Location("深灰市"));

        /** 到了第二個城鎮 - 華藍市 **/
        Nurse nurse2 = (Nurse) nurse.clone();
        nurse2.setWorkLocationName("華蘭市");

        /** 到了第三個城鎮 - 枯葉市 **/
        Nurse nurse3 = (Nurse) nurse2.clone();
        nurse3.setWorkLocationName("枯葉市");

        /** 看看三個喬伊小姐的開場白 **/
        System.out.println(nurse);
        System.out.println(nurse2);
        System.out.println(nurse3);
    }
}
