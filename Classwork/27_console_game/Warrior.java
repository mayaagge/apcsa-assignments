public class Warrior extends Adventurer{
  private String name;
  private int HP, maxHP;
  private int willpower;

  //default constructor
  public Warrior(String name){
    this(name, 100, 100, 50);
  }

  public Warrior(String name, int HP, int maxHP, int willpower){
    super(name, HP);
    this.maxHP = maxHP;
    this.willpower = willpower;
  }

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName(){
    return "Willpower";
  }
  //accessor methods
  public int getSpecial(){
    return willpower;
  }
  public void setSpecial(int newSpecial){
    willpower = newSpecial;
  }
  public int getSpecialMax(){
    return 100;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    int dmg = 18 + other.getSpecial() / 5;
    other.applyDamage(dmg);
    this.restoreSpecial(5);
    return this.getName() + " attacks " + other.getName() + " and deals " + dmg + " damage.";
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
         if (other.getHP() + 5 > other.getmaxHP()){
      other.setHP(other.getmaxHP());
    }
    else{
      other.setHP(5 + other.getHP());
    }
    return this.getName() + " heals " + other.getName() + " by " + 5 + " HP.";
  }

  //heall or buff self
  public String support(){
    if (this.getHP() + 10 > this.getmaxHP()){
      this.setHP(this.getmaxHP());
    }
    else{
      this.HP += 10;
    }
    return this.getName() + " heals self by " + 10 + " HP.";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if (willpower < 10){
      return "Not sufficient willpower to use special attack.";
    } else{
      int dmg = 25 + other.getSpecial() / 5;
      other.restoreSpecial(-10);
      other.applyDamage(dmg);
      return this.getName() + " uses " + this.getSpecialName() + " against " + other.getName() + " and deals "  + dmg + " damage.";
    }
  }
}
