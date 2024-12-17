public class Barbarian extends Adventurer{
    private String name;
    private int HP, maxHP;
    private int insanity;

    //default constructor
    public Barbarian(String name){
      this(name, 80, 80, 25);
    }

    public Barbarian(String name, int HP, int maxHP, int insanity){
      super(name, HP);
      this.maxHP = maxHP;
      this.insanity = insanity;
    }

    /*
      all adventurers must have a custom special
      consumable resource (mana/rage/money/witts etc)
    */
    //give it a short name (fewer than 13 characters)
    public String getSpecialName(){
      return "Insanity";
    }
    //accessor methods
    public int getSpecial(){
      return insanity;
    }
    public void setSpecial(int newSpecial){
      insanity = newSpecial;
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
      int dmg = 10 + other.getSpecial() / 2;
      other.applyDamage(dmg);
       if (this.getSpecial() +3 > this.getSpecialMax()){
      this.setSpecial(this.getSpecialMax());
      }else{
      this.restoreSpecial(3);
      }
      return this.getName() + " attacks " + other.getName() + " and deals " + dmg + " damage." + this.getName() + " gain 5 XP to your special power.";
    }

    //heall or buff the target adventurer
    public String support(Adventurer other){
            if (other.getHP() + 8 > other.getmaxHP()){
      other.setHP(other.getmaxHP());
    }
    else{
      other.setHP(8 + other.getHP());
    }
      return this.getName() + " heals " + other.getName() + " by " + 8 + " HP.";
    }

    //heall or buff self
    public String support(){
    if (this.getHP() + 8 > this.getmaxHP()){
      this.setHP(this.getmaxHP());
    }
    else{
      this.setHP(8 + this.getHP());
    }
      return this.getName() + " heals self by " + 8 + " HP.";
    }

    //hurt or hinder the target adventurer, consume some special resource
    public String specialAttack(Adventurer other){
      if (insanity < 15){
        return "Not sufficient willpower to use special attack.";
      } else{
        int dmg = 20 + insanity / 5;
        if (this.getSpecial() - 10 > 0){
         this.setSpecial(0) ;
      }else{
      this.restoreSpecial(-10);
      }
        other.applyDamage(dmg);
        return this.getName() + " uses " + this.getSpecialName() + " against" + other.getName() + and deals "  + dmg + " damage also dealing 10 XP damage the special power.";    }
      }
    }
  }
