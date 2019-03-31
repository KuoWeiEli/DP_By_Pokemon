package composite;

/** 小隊 **/
public class Team extends Rocket {
    public Team(String name, String target) { super(name, target); }

    @Override
    public void add(Rocket rocket) { System.out.println("請聯絡組織"); }

    @Override
    public void remove(Rocket rocket) {
        System.out.println("請聯絡組織");
    }

    @Override
    public void action() {
        System.out.printf("%s出動抓捕%s!%n", name, target);
    }

    @Override
    public void display(int level) {
        for (int i = 0; i < level; i++)
            System.out.printf("-");
        System.out.println(name);
    }
}
