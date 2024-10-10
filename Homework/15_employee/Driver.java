public class Driver{
    public static void main(String[]args){
      Employee emp = new Employee(70,000);
      System.out.println("initial salary with: " + emp.getSalary());
      emp.setSalary(500,000);
      System.out.println("updated salary with: " + emp.getSalary());
      Employee.message();
    }
}
