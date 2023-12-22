package src.innerFuncs;

import src.objects.Person;
import src.table.*;

import java.util.LinkedList;

public class GroupInfo {
    public static void groupInfo(LinkedList<Person> g){
        String loc = "";
        if (g.equals(Groups.getOutGroup())){
            loc = " на улице";
        } else if (g.equals(Groups.getHomeGroup())){
            loc = " дома";
        }
        for (Object s: g.toArray()){
            System.out.print(s + " ");
        }
        System.out.println(" сейчас находятя" + loc);
    }
}

