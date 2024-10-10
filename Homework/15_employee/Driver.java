public class Driver{
    public static void main(String[]args){
      Employee emp = new Employee(70,000, "CEO", "Computer Science", 50);
      System.out.println("initial salary with: " + salary.getSalary());
      salary.setSalary(500,000);
      System.out.println("updated salary with: " + salary.getSalary());
      Employee.message();
    }
}
