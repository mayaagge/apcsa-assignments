public class Employee{
  private int salary;
  private String position;
  private String field;
  private int hoursWeek;

  public Employee(){
  }

  public Employee(int mySalary)
  {
    salary = mySalary;
  }

  public Employee(int mySalary, String myPosition, String myField, int myHoursWeek){
    salary = mySalary;
    position = myPosition;
    field = myField;
    hoursWeek = myHoursWeek;
  }

  public int getSalary(){
    return salary;
  }

  public int getHoursWeek(){
    return hoursWeek;
  }
  
  public String getPosition(){
    return position;
  }

  public String getField(){
    return field;
  }

  public void setSalary (int newSalary){
    salary = newSalary;
  }

  public void getHoursWeek (int newHoursWeek){
    hoursWeek = newHoursWeek;
  }

  public void setPosition (String newPosition){
    position = newPosition;
  }

  public void setField (String newField){
    field = newField;
  }

  public void information(){
    System.out.println("Salary: " + salary);
    System.out.println("Hours per week: " + hoursWeek);
    System.out.println("Field: " + field);
    System.out.println("Position: " + position);
  }
  
  public int calcSalaryWeek(){
    return salary/hoursWeek;
  }

  public static void message(){
    System.out.println("Hi!");
  }
}
