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
        /* if (other.getHP() <= 0){
        return "Cannot attack this character because they are dead.";
      }
      if (this.getHP() <= 0){
        return "Cannot attack this character because you are dead.";
      }
            */
      int dmg = 10 + insanity / 2;
      other.applyDamage(dmg);

      if (this.getSpecial() + 3 > this.getSpecialMax()){
        this.setSpecial(this.getSpecialMax());
      }
      else{
        insanity += 3;
      }
        /*
      if(other.getHP() <= 0){
        return other.getName() + " died.";
      }
         */
      return this.getName() + " attacks " + other.getName() + " and deals " + dmg + " damage. Their HP is now " +other.getHP();
    }

    //heall or buff the target adventurer
    public String support(Adventurer other){
        /*
      if (other.getHP() <= 0){
        return "Cannot support this character because they are dead.";
      }
      if (this.getHP() <= 0){
        return "Cannot support this character because you are dead.";
      }
         */
      if (other.getHP() + 8 > other.getmaxHP()){
        other.setHP(other.getmaxHP());
      }
      else{
        other.setHP(8 + other.getHP());
      }
      return this.getName() + " heals " + other.getName() + " by " + 8 + " hp.";
    }

    //heall or buff self
    public String support(){
        /*
      if (this.getHP() <= 0){
        return "Cannot support because you are dead.";
      }
         */
      if (this.getHP() + 8 > this.getmaxHP()){
        this.setHP(this.getmaxHP());
      }
      else{
        this.HP += 8;
      }
      this.restoreSpecial(5);
      return this.getName() + " heals self by " + 8 + " hp.";
    }

    //hurt or hinder the target adventurer, consume some special resource
    public String specialAttack(Adventurer other){
        /*
      if (other.getHP() <= 0){
        return "Cannot special attack this character. They are dead.";
      }
      if (this.getHP() <= 0){
        return "Cannot special attack this character. You are dead.";
      }
        */
      if (insanity < 15){
        return "Not sufficient willpower to use special attack.";
      } else{
        other.setSpecial(other.getSpecial() -  15);
        int dmg = 20 + insanity / 5;
        other.applyDamage(dmg);
        /*
        if(other.getHP() <= 0){
          return other.getName() + " died.";
        }
          */
        return this.getName() + " uses " + this.getSpecialName() + " against " + other.getName() + " and deals "  + dmg + " damage. Their HP is now " + other.getHP();
      }
    }
  }
