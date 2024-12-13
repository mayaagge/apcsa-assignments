public class Warrior extends Adventurer{
  private String name;
  private int HP, maxHP;
  private int fortitude;

  //default constructor
  public Warrior(String name){
    this(name, 150, 150, 50);
  }

  public Warrior(String name, int HP, int maxHP, int fortitude){
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
    return 100;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    if (other.getHP <= 0){
      return "Cannot attack this character because they are dead.";
    }
    if (this.getHP <= 0){
      return "Cannot attack this character because you are dead.";
    }
    int dmg = 15; //should factor in agility otherwise no use
    other.applyDamage(dmg);
    if (this.getSpecial() + 5 > this.getSpecialMax()){
      this.setSpecial(this.getSpecialMax())
    }
    else{
      fortitude += 5;
    }
    if(other.getHP() <= 0){
      return other.getName() + " died."
    }
    return this.getName() + " attacks " + other.getName() + " and deals " + dmg + " damage to. Their HP is now " +other.getHP();
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    if (other.getHP <= 0){
      return "Cannot support this character because they are dead.";
    }
    if (this.getHP <= 0){
      return "Cannot support this character because you are dead.";
    }
    if (other.getHP() + 10 > other.getmaxHP()){
      other.setHP(other.getmaxHP());
    }
    else{
      other.setHP(10 + other.getHP());
    }
    return this.getName() + " heals " + other.getName() + " by " + 10 + " hp.";
  }

  //heall or buff self
  public String support(){
    if (this.getHP <= 0){
      return "Cannot support because you are dead.";
    }
    if (this.getHP() + 15 > this.getmaxHP()){
      this.setHP(this.getmaxHP());
    }
    else{
      this.HP += 15;
    }
    return this.getName() + " heals self by " + 15 + " hp.";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if (other.getHP <= 0){
      return "Cannot special attack this character. They are dead.";
    }
    if (this.getHP <= 0){
      return "Cannot special attack this character. You are dead.";
    }
    if (willpower < 10){
      return "Not sufficient willpower to use special attack.";
    }
    else{
      fortitude -= 10;
      int dmg = 25 + agility / 5;
      other.applyDamage(dmg);
      if(other.getHP() <= 0){
        return other.getName() + " died."
      }
      return this.getName() + " uses " + this.getSpecialName() + " and deals " + dmg + " damage to "  + other.getName() ". Their HP is now " + other.getHP();
    }
  }

}
