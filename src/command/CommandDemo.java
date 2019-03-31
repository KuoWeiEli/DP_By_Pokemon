package command;

/** 命令模式 - 示範 **/
public class CommandDemo {
    public static void main(String[] args) {
        System.out.println("玩家依序將有著異常狀態的寶可夢交給喬伊小姐");
        Nurse nurse = new Nurse();
        MachineHealer healer = new MachineHealer();
        /** 連續將七隻燒傷寶可夢交給喬伊小姐 **/
        nurse.request(new HealBurnRequest(healer));
        nurse.request(new HealBurnRequest(healer));
        nurse.request(new HealBurnRequest(healer));
        nurse.request(new HealBurnRequest(healer));
        nurse.request(new HealBurnRequest(healer));
        nurse.request(new HealBurnRequest(healer));
        /** 這一隻將會出現警告訊息：提醒最多只能治療六隻寶可夢 **/
        nurse.request(new HealBurnRequest(healer));
        /** 不治療了，想要另外治療其他隻寶可夢，所以取消所有請求 **/
        nurse.cancel();
        /** 再次請求治療其他隻寶可夢 **/
        nurse.request(new HealBurnRequest(healer));
        nurse.request(new HealSleepRequest(healer));
        nurse.request(new HealPoisonRequest(healer));
        nurse.putAllPokeball();
    }
}

