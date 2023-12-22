package src.table.actions;

import src.objects.Action;
import src.objects.Person;

import java.util.GregorianCalendar;

public class StunningSpeak extends Action {
    Say say = new Say();
    Stunned stunned = new Stunned();
    public StunningSpeak(){}
    public void stunningSpeak (Person p1, Person p2){
        say.say(p1, "Погулять! А фета?");
        stunned.stunned(p2, "как дети учатся говорить... как иностранцы?");
    }
}
