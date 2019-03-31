package adapter;

/** 轉接器模式 - 示範 **/
public class AdapterDemo {
    public static void main(String[] args) {
        System.out.println("玩家要到下一個城鎮必須橫渡這片海過去!");
        System.out.println("玩家開始製作木筏");
        Raft raft = new Raft(new Box(), "小智");
        raft.surf();
        System.out.println("在海面上看到傑尼龜一起同行!");
        Squirtle squirtle = new Squirtle();
        squirtle.surf();
    }
}
