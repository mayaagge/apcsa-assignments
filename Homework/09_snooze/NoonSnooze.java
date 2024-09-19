import java.util.Scanner;

public class NoonSnooze{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How much time has elapsed since 12:00 pm in minutes?");
    int time = input.nextInt();
    int minutes = time % 60;
    int hours = (time / 60) % 12;
    if (hours == 0)
    {
      hours = 12;
    }
    String day = "pm";
    if ((time / 60) % 24 > 12)
      day = "am";
    if (time < 0)
    {
      System.out.println("No negative values are allowed");
    }
    if (time < 10)
    {
      System.out.println(hours + ":" + "0" + minutes + " " + day);
    }
    else
    {
      System.out.println(hours + ":" + minutes + " " + day);
    }
  }
}
