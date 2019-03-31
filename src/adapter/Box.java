package adapter;

/** 箱子 **/
public class Box {
    /** 擁有裝載功能，可以讓人坐在裡面 **/
    public void load(String name) {
        System.out.printf("%s坐在箱子裡面!%n", name);
    }
}
