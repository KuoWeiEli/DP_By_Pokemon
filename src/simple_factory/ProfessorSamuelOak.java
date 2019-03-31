package simple_factory;

/** 大木博士 **/
public class ProfessorSamuelOak {
    /**
     * 分別代表台上三顆精靈球
     **/
    public static final String LEFT = "left";
    public static final String MIDDLE = "middle";
    public static final String RIGHT = "right";

    /**
     * 選擇寶可夢
     *
     * @param choice
     * @return
     */
    public static Pokemon getPokemon(String choice) {
        switch (choice) {
            case LEFT:
                Charmander charmander = new Charmander();
                charmander.setName("小火龍");
                return charmander;
            case MIDDLE:
                Squirtle squirtle = new Squirtle();
                squirtle.setName("傑尼龜");
                return squirtle;
            case RIGHT:
                Bulbasaur bulbasaur = new Bulbasaur();
                bulbasaur.setName("妙蛙種子");
                return bulbasaur;
            default:
                System.out.println("沒有選擇寶可夢 !");
                return null;
        }
    }
}

