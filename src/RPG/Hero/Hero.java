package RPG.Hero;

import RPG.Hero.HeroAttribute.HeroAttribute;
import RPG.Hero.items.Item;
import RPG.Hero.items.Slot;

import java.util.HashMap;

public abstract class Hero {
    //fields
    private String name;
    private int level;

    private String levelAttribute;
    HeroAttribute primaryHeroAttribute;

    HashMap<Slot, Item> equipments = new HashMap<Slot, Item>();


    //constructor
    public Hero(String name, int level) {
        this.name = name;
        this.level = 1;
        primaryHeroAttribute = new HeroAttribute(1, 2, 3);
    }

    //getter
    public String getname() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    //method
    public void levelUp() {
        level++;
    }

    public void equip(){

    }

    public  void damage(){

    }

    public void totalAttributes(){

    }

    public void display(){

    }

    //if (hero< requiredLevel){
    //they cannot equip item}


}
