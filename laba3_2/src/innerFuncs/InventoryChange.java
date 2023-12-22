package src.innerFuncs;

import src.objects.Item;
import src.objects.Person;

public class InventoryChange {
    public static void inventoryChange(Person p, int i, Item i1){
        p.getInventory().set(i, i1);
    }
}
