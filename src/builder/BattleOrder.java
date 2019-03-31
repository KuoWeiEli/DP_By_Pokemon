package builder;

import abstract_factory.Trainer;

/** 出戰順序介面 **/
public interface BattleOrder {
    /** 決定出戰順序 **/
    void assignOrder(Trainer trainer);
}
