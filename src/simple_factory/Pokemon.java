package simple_factory;

/** 寶可夢 */
public abstract class Pokemon {
    protected String name;

    protected String getName() { return this.name; }

    protected void setName(String name) { this.name = name;}

    protected abstract void showInfo();
}

