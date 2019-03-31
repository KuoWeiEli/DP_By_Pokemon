package proxy;

/** 代理模式-示範 **/
public class ProxyDemo {
    public static void main(String[] args) {
        /** 到健康中心電腦前操作電腦 **/
        Computer computer = new Computer();

        /** 將綠毛蟲送去保管 **/
        Pokemon caterpie = new Pokemon("綠毛蟲");
        computer.put(caterpie);
        /** 操作不正確，沒有選擇寶可夢 **/
        computer.put(null);

        /** 將手上寶可夢都送去保管 **/
        Pokemon pikachu = new Pokemon("皮卡丘");
        computer.put(pikachu);
        computer.put(new Pokemon("傑尼龜"));
        computer.put(new Pokemon("小火龍"));
        computer.put(new Pokemon("妙蛙種子"));

        /** 綠毛蟲決定放生 **/
        computer.remove(caterpie);

        /** 將皮卡丘領出 **/
        computer.get(pikachu);
    }
}
