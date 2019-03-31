package adapter;

/** 木筏 **/
public class Raft implements Surf {
    /** 箱子 **/
    private Box box;
    /** 乘客 **/
    private String name;
    /** 將箱子準備好，乘客準備坐上去 **/
    public Raft(Box box, String name) {this.box = box; this.name = name; }

    @Override
    public void surf() {
        System.out.println("Step1: 將木頭排在一起並用繩子固定住~");
        System.out.println("Step2: 將箱子固定在木頭上面!");
        System.out.println("Step3: 準備兩隻划槳!");
        box.load(name);
        System.out.println("準備出發，使用划槳在海面上移動 !!!!");
    }
}
