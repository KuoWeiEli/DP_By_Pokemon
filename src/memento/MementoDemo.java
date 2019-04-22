package memento;

import java.util.ArrayList;
import java.util.List;

/** 備忘錄模式 - 示範 **/
public class MementoDemo {
    public static void main(String[] args) {
        Player player = new Player();
        List pokemons = new ArrayList();
        pokemons.add("綠毛蟲");
        pokemons.add("小拉達");
        pokemons.add("皮卡丘");
        player.setPokemons(pokemons);

        List gyms = new ArrayList();
        gyms.add("深灰道館");
        gyms.add("華藍道館");
        player.setGyms(gyms);

        player.setLocation("枯葉市");

        /** 玩累了，存檔後關機，明天再玩！ **/
        ArchiveZone zone = new ArchiveZone();
        zone.setArchive(player.save());

        System.out.println("----------------關機----------------");
        System.out.println("-------------隔天讀取紀錄-------------");
        Player tomorrowPlayer = new Player();
        tomorrowPlayer.load(zone.getArchive());
        tomorrowPlayer.showInfo();
    }
}
