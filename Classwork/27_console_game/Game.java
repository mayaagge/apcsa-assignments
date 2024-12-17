import java.util.Scanner;
import java.util.Random;

public class Game{
    public static void printStats(Adventurer x){
        String s1 = x.getName() + " has " + x.getHP() + " XP left.";
        String s2 = x.getName() + " has " + x.getSpecial() + " XP of " + x.getSpecialName() + " left.";
        System.out.println(s1);
        System.out.println(s2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Adventurer player;
        Adventurer enemy;

        System.out.println("What would you like to name your character?");
        String playerName = scanner.nextLine();

        System.out.println("Hi " + playerName + ". Choose your player class: warrior / fortress / barbarian");
        String playerClass = scanner.nextLine();
        while(!playerClass.equals("warrior") && !playerClass.equals("fortress") &&
          !playerClass.equals("barbarian")){
            System.out.println("Invalid player class. Choose your player class: warrior / fortress / barbarian");
            playerClass = scanner.nextLine();
        }
            //player setup
            if (playerClass.equals("fortress")){
                player = new Fortress("" + playerName);
                System.out.println(playerName + " is a fortress.");
            } else if (playerClass.equals("barbarian")){
                player = new Barbarian("" + playerName);
                System.out.println(playerName + " is a barbarian.");
            } else {
                player = new Warrior("" + playerName);
                System.out.println(playerName + " is a warrior.");
            }
        printStats(player);
        //enemy setup
        int enemyClass = random.nextInt(3);
        if (enemyClass == 0){
            enemy = new Warrior("Enemy");
            System.out.println("Enemy is a warrior.");
        } else if (enemyClass == 1){
            enemy = new Fortress("Enemy");
            System.out.println("Enemy is a fortress.");
        } else{
            enemy =  new Barbarian("Enemy");
            System.out.println("Enemy is a barbarian.");
        }

        //print stats
        
        printStats(enemy);
        //gameplay
        while (player.getHP() > 0 && enemy.getHP() > 0){ //go thru the actions and check if it equals of the choices and run action
          System.out.println("Type: attack / special / support / quit");
          String action = scanner.nextLine();
          while(!action.equals("attack") && !action.equals("a") &&
          !action.equals("special") && !action.equals("sp") &&
          !action.equals("support") && !action.equals("su") &&
          !action.equals("quit")){
            System.out.println("Invalid action. Type: attack / special / support / quit");
            action = scanner.nextLine();
          }

          if (action.equals("attack") || action.equals("a")){
            player.attack(enemy);
          } else if (action.equals("special") || action.equals("sp")){
            player.specialAttack(enemy);
          } else if (action.equals("support") || action.equals("su")){
            System.out.println("self / enemy"); //diff options of who to heal
            String decision = scanner.nextLine();
            
            if (decision.equals("enemy")){
              player.support(enemy);
            } else{
              player.support(player);
            }
          } else if (action.equals("quit")){
            System.out.println("You quit the game.");
            return;
          }
        
          if (enemy.getHP() <= 0){
            System.out.println("You have defeated the enemy!");
            break;
          }
        printStats(player);
        printStats(enemy);

          int enemyAction = random.nextInt(3);
          if (enemyAction == 0){
            enemy.attack(player);
          } else if (enemyAction == 1){
            enemy.specialAttack(player);
          } else{
            enemy.support();
          }

          if (player.getHP() <= 0){
            System.out.println("You have been defeated!");
            break;
          }
        printStats(player);
            printStats(enemy);
        }

        scanner.close();

    }
}
