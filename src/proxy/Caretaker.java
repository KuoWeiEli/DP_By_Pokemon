package proxy;

/** 保管人 **/
public interface Caretaker {
    /** 領回寶可夢 **/
    Pokemon get(Pokemon pokemon);
    /** 保管寶可夢 **/
    void put(Pokemon pokemon);
    /** 放生寶可夢 **/
    void remove(Pokemon pokemon);
}
