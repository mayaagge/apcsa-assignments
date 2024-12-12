public class Warrior extends Adventurer{
  private String name;
  private int hp;
  private int agility;
  private String powerName;
  private int willpower;
  private String movementName


  public Warrior(String name){
    this(name, 100, 100, 25, 25, "Willpower", "Agility";
  }
  public Warrior(String name, int hp, int maxHP, int agility, int willpower, String powerName, String movementName){
    super(name, hp);
    this.maxHP = maxHP;
    this.agility = agility;
    this.powerName = powerName;
    this.movementName = movementName;
    this.willpower = willpower;
  }
  public String getSpecialName(){
    return powerName;
  }
  public int getSpecial(){
    return agility;
  }
  public void setSpecial(int newAgility){
    agility = newAgility;
  }
  public int getSpecialMax(){
    return 100;
  }
  public String attack(Adventurer other){

  }
  public String suport(Adventurer other){

  }
  public String suport(){

  }
  public String specialAttack(Adventurer other){

  }
}
