package RPG.Hero.items;
import RPG.Hero.items.Enums.Armortype;
import RPG.Hero.items.Enums.Weapontype;

public abstract class Item {
    //fields
    private String name;
    private int requiredLevel;
    private Slot slot;

    private Weapontype weaponType;

    private Armortype ArmorType;

    //constructor
    public Item(String name,int requiredLevel,Slot slot, Weapontype weaponType,Armortype ArmorType){
        this.name=name;
        this.requiredLevel=requiredLevel;
        this.slot=slot;
        this.weaponType=weaponType;
        this.ArmorType=ArmorType;
    }
}
