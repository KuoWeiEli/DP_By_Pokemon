package abstract_factory;

/** 寶可夢 **/
public abstract class Pokemon {
    /** 寶可夢名稱 **/
    protected String name;
    protected String getName() { return this.name; }
    protected void setName(String name) { this.name = name; }

    /** 寶可夢屬性 **/
    protected abstract String getProperty();

    /** 寶可夢類型 **/
    protected abstract String getType();
}
