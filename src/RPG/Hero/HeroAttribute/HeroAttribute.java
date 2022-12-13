package RPG.Hero.HeroAttribute;

public class HeroAttribute {
    //fields
    private int strength;
    private int dexterity;
    private int intelligence;

    //constructor
    public HeroAttribute (int strength,int dexterity, int intelligence){
        this.strength = strength;
        this.dexterity=dexterity;
        this.intelligence=intelligence;
    }
    //getter
    public int getStrength(){
        return strength;
    }
    public int getDexterity(){
        return  dexterity;
    }
    public int getIntelligence(){
        return intelligence;
    }
    //to set the total Attribute for the hero
    public  void  setTotalAttribute(int strength,int dexterity,int intelligence){
       this.strength=strength;
       this.dexterity=dexterity;
       this.intelligence=intelligence;
    }
    //get the total Attribute
    public String getAllAttribute(){
        return strength + " " + dexterity+" " + intelligence;
    }
}
