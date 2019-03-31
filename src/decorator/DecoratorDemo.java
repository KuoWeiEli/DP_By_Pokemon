package decorator;


/** 裝飾模式 - 示範 **/
public class DecoratorDemo {
    public static void main(String[] args) {
        System.out.println("玩家拿起寶貝球...");
        Ball pokeBall = new PokeBall();
        pokeBall.cast();

        System.out.println("---------------------");
        System.out.println("遇到超夢...拿起大師球...");
        pokeBall = new MasterBall(new PokeBall());
        pokeBall.cast();

        System.out.println("---------------------");
        System.out.println("遇到超夢，女友又在旁邊...? 加上一些炫麗的特效好了...");
        pokeBall = new BeautyBall(new MasterBall(new PokeBall()));
        pokeBall.cast();
    }
}
