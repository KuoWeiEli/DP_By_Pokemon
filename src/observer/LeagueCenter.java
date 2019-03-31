package observer;

import java.util.ArrayList;
import java.util.List;

/** 寶可夢聯盟中心 **/
public class LeagueCenter extends Center {
    private List<Member> members = new ArrayList();
    private int bonus;

    @Override
    public void add(Member m) {
        members.add(m);
    }

    @Override
    public void remove(Member m) {
        members.remove(m);
    }

    @Override
    public void setBonus(int count) {
        this.bonus = count;
        notifyAllMembers();
    }

    @Override
    public int getBonus() {
        return this.bonus;
    }

    @Override
    public void notifyAllMembers() {
        for (Member m: members)
            m.receive();
    }
}
