package command;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 喬伊小姐 **/
public class Nurse {
    private List<HealRequest> requests = new ArrayList();

    /** 請求治療 **/
    public void request(HealRequest request) {
        if (requests.size() >= 6) {
            System.out.println("寶可夢最多只能六個！");
            return;
        }
        requests.add(request);
        System.out.printf("玩家請求%s，紀錄時間：%s%n", request,
                new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

    /** 取消治療 **/
    public void cancel() {
        requests.clear();
        System.out.println("已取消所有寶可夢治療！");
    }

    /** 將玩家請求治療的寶貝球放入治療機器裡 **/
    public void putAllPokeball() {
        if (requests.size() == 0) {
            System.out.println("沒有選擇要治療的寶可夢！");
            return;
        }
        for (HealRequest request: requests)
            request.heal();
    }
}
