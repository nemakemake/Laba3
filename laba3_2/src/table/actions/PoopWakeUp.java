package src.table.actions;

import src.enums.Condition;
import src.innerFuncs.ChangeQuality;
import src.interfaces.Describing;
import src.objects.Action;
import src.objects.Item;
import src.objects.Person;
import src.innerFuncs.*;

public class PoopWakeUp extends Action implements Describing {
    public void poopWakeUp(Person p1, Item i1){
        describe(p1 + " проснулся обкакавшись");
        ChangeQuality.changeQuality(Condition.NORMAL, p1, true);
        ChangeQuality.changeQuality(Condition.DIRTY, p1, i1, true);
        InventoryChange.inventoryChange(p1,0, i1);
        ItemDamage.itemDamage(i1, 5);
    }
}
