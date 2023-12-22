package src.table.actions;

import src.innerFuncs.DelItem;
import src.innerFuncs.InventoryChange;
import src.interfaces.Describing;
import src.objects.Action;
import src.objects.Item;
import src.objects.Person;


public class ChangeClothes extends Action implements Describing {
    public void changeClothes(Person p1, Person p2, Item i1){
        describe(p1 + " поменял " + p2.getInventory().get(0) +" "+ p2);
        DelItem.delItem(p1, i1, false);
        InventoryChange.inventoryChange(p2,0, i1);
    }
}
