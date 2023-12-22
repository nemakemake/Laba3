package src.table.actions;

import src.enums.Condition;
import src.innerFuncs.ChangeQuality;
import src.objects.Action;
import src.objects.Person;


public class Stunned extends Action {

    public static void stunned(Person p1, String t1) {
        Think think = new Think();
        think.think(p1, t1);
        ChangeQuality.changeQuality(Condition.STUNNED, p1, true);
    }
}
