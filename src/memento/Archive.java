package memento;

import java.util.ArrayList;
import java.util.List;

/** 記錄 **/
public class Archive {
    /** 收服的寶可夢 **/
    private List<String> pokemons = new ArrayList();
    /** 打敗的道館 **/
    private List<String> gyms = new ArrayList();
    /** 目前所在的位置 **/
    private String location;

    public Archive(List pokemons, List gyms, String location) {
        this.pokemons = pokemons;
        this.gyms = gyms;
        this.location = location;
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
