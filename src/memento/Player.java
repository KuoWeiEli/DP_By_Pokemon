package memento;

import java.util.ArrayList;
import java.util.List;

/** 玩家 **/
public class Player {
    /** 收服的寶可夢 **/
    private List<String> pokemons = new ArrayList();
    /** 打敗的道館 **/
    private List<String> gyms = new ArrayList();
    /** 目前所在的位置 **/
    private String location;

    /** 存檔 **/
    public Archive save() {
        return new Archive(pokemons, gyms, location);
    }

    /** 讀檔 **/
    public void load(Archive archive) {
        this.pokemons = archive.getPokemons();
        this.gyms = archive.getGyms();
        this.location = archive.getLocation();
    }

    /** 顯示玩家資訊 **/
    public void showInfo() {
        System.out.printf("寶可夢：%s%n道館：%s%n目前位置：%s%n",
            this.pokemons, this.gyms, this.location);
    }

    public List<String> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<String> pokemons) {
        this.pokemons = pokemons;
    }

    public List<String> getGyms() {
        return gyms;
    }

    public void setGyms(List<String> gyms) {
        this.gyms = gyms;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
