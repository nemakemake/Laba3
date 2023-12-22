package src.table.actions;

import src.enums.Condition;
import src.innerFuncs.ChangeQuality;
import src.innerFuncs.InventoryChange;
import src.innerFuncs.ItemDamage;
import src.objects.Item;
import src.objects.Person;
import src.interfaces.Describing;

public class Draw implements Describing {
    public void draw(Person p1, Item i1, Item i2){
        describe(p1 + " рисовал в " + i1 +" с помощью "+ i2);
        ItemDamage.itemDamage(i1, 3);
        ChangeQuality.changeQuality(Condition.DIRTY, p1, i1, true);
        InventoryChange.inventoryChange(p1,2, i1);
    }
}
