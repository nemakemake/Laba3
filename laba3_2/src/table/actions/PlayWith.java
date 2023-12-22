package src.table.actions;

import src.interfaces.Describing;
import src.objects.Action;
import src.objects.Person;

import java.util.Random;

public class PlayWith extends Action implements Describing {
    private final double CHANCE = 0.5;
    private final Random rnd = new Random();
    public void playWith(Person p1, Person p2){
        System.out.println(p1 + " игрался c "+ p2);
        if (rnd.nextDouble() < CHANCE) {
            System.out.print("-> Неудача: ");
            Ignore.ignore(p2, p1);
        } else {
            System.out.print("-> Удача: ");
            React.react(p2, p1);
        }
    }
}
