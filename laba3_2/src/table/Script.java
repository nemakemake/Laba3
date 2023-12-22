package src.table;

import src.enums.Condition;
import src.enums.Weather;
import src.exceptions.DriverLicenseException;
import src.innerFuncs.*;
import src.interfaces.ScriptInfo;
import src.objects.Item;
import src.objects.Nature;
import src.table.actions.*;
import src.table.actors.*;



public class Script {
    //scriptInfo
    private String name;

    //actors
    Luis luis = new Luis("Луис", Condition.NORMAL);
    Gadge gadge = new Gadge("Гэдж", Condition.NORMAL);
    Jude jude = new Jude("Джуд", Condition.LIGHT_SORROW);
    Rachel rachel = new Rachel("Рошель", Condition.NORMAL);
    Ellie ellie = new Ellie("Элли", Condition.NORMAL);

    //items
    Item kite = new Item("воздушный змей", Condition.NORMAL);
    Item crayon = new Item("цветные фломастеры", Condition.NORMAL);
    Item book = new Item("книжка Элли", Condition.NORMAL);

    // actions
    PoopWakeUp pWU = new PoopWakeUp();
    ChangeClothes chC = new ChangeClothes();
    PlayWith playWith = new PlayWith();
    Remember remember = new Remember();
    Say say = new Say();
    Draw draw = new Draw();
    Think think = new Think();
    StunningSpeak stunningSpeak = new StunningSpeak();

    public Script(String name){ this.name = name;}

    public String getName() {
        return name;
    }

    ScriptInfo scriptInfo = new ScriptInfo() {
        @Override
        public void scriptInfo(Script script) {
            System.out.println(script.getName());
        }
    };

    public void printScript() {
        scriptInfo.scriptInfo(this);
        Nature.WeatherForecast.weatherInfo();
        AddToGroup.addTo(luis, Groups.getHomeGroup());
        AddToGroup.addTo(gadge, Groups.getHomeGroup());
        AddToGroup.addTo(rachel, Groups.getHomeGroup());
        AddToGroup.addTo(ellie, Groups.getHomeGroup());
        AddToGroup.addTo(jude, Groups.getOutGroup());
        TimeSkip.timeSkip(41, true);
        GroupInfo.groupInfo(Groups.getHomeGroup());
        TimeSkip.timeSkip(40,true);
        ChangeQuality.changeQuality(Condition.SLEEP, gadge, true);
        Groups.changeGroup(rachel);
        Groups.changeGroup(ellie);
        Item.Car car = (Item.Car)jude.getInventory().getFirst();
        car.drive(Groups.getOutGroup(), jude, "магазин");
        pWU.poopWakeUp(gadge, gadge.getInventory().get(0));
        chC.changeClothes(luis, gadge, gadge.getInventory().get(0));
        playWith.playWith(luis, gadge);
        ChangeWeather.changeWeather(Weather.WINDY);
        remember.remember(luis, kite);
        say.say(luis, luis.call(gadge));
        AddItem.addItem(gadge, crayon);
        AddItem.addItem(gadge, book);
        draw.draw(gadge, gadge.getInventory().get(2),  gadge.getInventory().get(1));
        think.think(luis, "еще один шаг, питающий детскую ревность");
        say.say(gadge, "Что?");
        say.say(luis, "Хочешь пойти гулять?");
        stunningSpeak.stunningSpeak(gadge, luis);
    }
}
