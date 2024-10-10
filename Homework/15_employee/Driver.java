public class Driver{
    public static void main(String[]args){
      Employee emp = new Employee(70000, 50);
      System.out.println("initial salary with: " + emp.getSalary());
      emp.setSalary(500000);
      System.out.println("updated salary with: " + emp.getSalary());
      Employee.message();
    }
}
