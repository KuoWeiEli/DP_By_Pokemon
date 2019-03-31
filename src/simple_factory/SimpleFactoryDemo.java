package simple_factory;

/** 簡單工廠模式-示範 */
public class SimpleFactoryDemo {
    public static void main(String[] args) {
        System.out.println("選擇左邊的精靈球");
        Pokemon pokemon = ProfessorSamuelOak.getPokemon(ProfessorSamuelOak.LEFT);
        pokemon.showInfo();

        System.out.println("選擇中間的精靈球");
        pokemon = ProfessorSamuelOak.getPokemon(ProfessorSamuelOak.MIDDLE);
        pokemon.showInfo();

        System.out.println("選擇右邊的精靈球");
        pokemon = ProfessorSamuelOak.getPokemon(ProfessorSamuelOak.RIGHT);
        pokemon.showInfo();
    }
}

