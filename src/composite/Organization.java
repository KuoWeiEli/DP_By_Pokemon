package composite;

import java.util.ArrayList;
import java.util.List;

/** 組織 **/
public class Organization extends Rocket {
    private List<Rocket> group = new ArrayList();
    public Organization(String name, String target) { super(name, target); }

    @Override
    public void add(Rocket rocket) {
        group.add(rocket);
    }

    @Override
    public void remove(Rocket rocket) {
        group.remove(rocket);
    }

    @Override
    public void action() {
        System.out.printf("%s準備大型機具捕捉%s!%n", name, target);
        for(Rocket rocket: group) rocket.action();
    }

    @Override
    public void display(int level) {
        for (int i = 0; i < level; i++)
            System.out.printf("-");
        System.out.println(name);

        level++;
        for (Rocket rocket: group) rocket.display(level);
    }
}
