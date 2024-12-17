public class Fortress extends Adventurer{
  private String name;
  private int HP, maxHP;
  private int fortitude;

  //default constructor
  public Fortress(String name){
    this(name, 150, 150, 50);
  }

  public Fortress(String name, int HP, int maxHP, int fortitude){
    super(name, HP);
    this.maxHP = maxHP;
    this.fortitude = fortitude;
  }

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName(){
    return "Fortitude";
  }
  //accessor methods
  public int getSpecial(){
    return fortitude;
  }
  public void setSpecial(int newSpecial){
    fortitude = newSpecial;
  }
  public int getSpecialMax(){
    return 50;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    int dmg = 15;
    other.applyDamage(dmg);
           if (this.getSpecial() +5 > this.getSpecialMax()){
      this.setSpecial(this.getSpecialMax());
      }else{
      this.restoreSpecial(5);
      }
      return this.getName() + " attacks " + other.getName() + " and deals " + dmg + " damage. " + this.getName() + " gains 5 XP to your special power if it is not at max.";
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    if (other.getHP() + 10 > other.getmaxHP()){
      other.setHP(other.getmaxHP());
    }
    else{
      other.setHP(10 + other.getHP());
    }
    return this.getName() + " heals " + other.getName() + " by " + 10 + " HP.";
  }

  //heall or buff self
  public String support(){
    if (this.getHP() + 15 > this.getmaxHP()){
      this.setHP(this.getmaxHP());
    }
    else{
      this.HP += 15;
    }
    return this.getName() + " heals self by " + 15 + " HP.";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if (fortitude < 10){
      return "Not sufficient fortitude to use special attack.";
    }
    else{
      if (other.getSpecial() - 10 < 0){
         other.setSpecial(0) ;
      }else{
      other.restoreSpecial(-10);
      }
      int dmg = 25 + other.getSpecial()/3;
      other.applyDamage(dmg);
      return this.getName() + " uses " + this.getSpecialName() + " against " + other.getName() + " and deals "  + dmg + " damage also dealing 10 XP damage the special power.";
    }
  }

}
