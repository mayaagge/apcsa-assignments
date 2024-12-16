import java.util.Scanner;
import java.util.Random;

public class Game{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Adventurer player;
        Adventurer enemy;

        System.out.println("What would you like to name your character?");
        String playerName = scanner.nextLine();

        System.out.println("Choose your player class: warrior / fortress / barbarian");
        String playerClass = scanner.nextLine();

        //designate correct classes
        if (playerClass.equals("fortress")){
            player = new Fortress("" + playerName);
        } else if (playerClass.equals("barbarian")){
            player = new Barbarian("" + playerName);
        } else {
            player = new Warrior("" + playerName);
        }

        int enemyClass = random.nextInt(3);
        if (enemyClass == 0){
            enemy = new Warrior("Enemy");
        } else if (enemyClass == 1){
            enemy = new Fortress("Enemy");
        } else{
            enemy =  new Barbarian("Enemy");
        }

        //print stats


        //gameplay
        while (player.getHP() > 0 && enemy.getHP() > 0){
            System.out.println("Type: attack / special / support / quit");
            String action = scanner.nextLine();
            //go thru the actions and check if it equals of the choices and run action

            if (action.equals("quit")){
                System.out.println("You quit the game.");
                return;
            }
        }


        //action of player

        //check enemy defeat

        //action of enemy

        //check player defeat

        //updated stats


    }
}
