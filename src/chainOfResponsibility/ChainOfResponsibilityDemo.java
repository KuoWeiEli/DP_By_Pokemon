package chainOfResponsibility;

/** 責任鏈模式 - 示範 **/
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        /** 設定對戰順序，初階→進階→大師 **/
        Battle beginner = new BeginnerBattle();
        beginner.setNextBattle(new AdvancedBattle())
                .setNextBattle(new MasterBattle());

        System.out.println("初心者發出對戰請求...");
        Request request = new Request();
        request.setScore(0);
        beginner.match(request);

        System.out.println("高手發出對戰請求...");
        request.setScore(60);
        beginner.match(request);

        System.out.println("大師發出對戰請求...");
        request.setScore(92);
        beginner.match(request);

        System.out.println("冠軍發出對戰請求...");
        request.setScore(100);
        beginner.match(request);
    }
}
