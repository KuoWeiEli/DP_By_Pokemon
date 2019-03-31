package bridge;

/** 寶可夢 **/
public abstract class Pokemon {
    private String name;
    private Evolution evolution;

    public Pokemon(String name) {
        this.name = name;
    }

    /** 進化邏輯 **/
    public void evolve() {
        if (evolution == null) return;
        evolution.evolve(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Evolution getEvolution() {
        return evolution;
    }

    public void setEvolution(Evolution evolution) {
        this.evolution = evolution;
    }
}
