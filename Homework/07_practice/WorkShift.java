public class Homework{
  public static void main(String[] args){
    int workHours = 20;
    workHours *= 60;
    int workMinutes = 42 + workHours;
    workMinutes *= 60;
    int workSeconds = 16 + workMinutes;
    System.out.println(workSeconds + " seconds");
  }
}
