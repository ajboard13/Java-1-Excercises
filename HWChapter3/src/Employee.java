
public class Employee {
    
   private String empfirstName;
   private String emplastName;
   private double empSalary;
   
   public Employee (String firstName, String lastName, double salary){
       empfirstName = firstName;
       emplastName = lastName;
       empSalary = salary;
   }
   
   public void setFirstName (String firstName){
       empfirstName = firstName;
   }
   public String getFirstName (){
       return empfirstName;
   }
   public void setlastName (String lastName) {
       emplastName = lastName;
   }
   public String getLastName () {
       return emplastName;
   }
   public void setSalary(double salary){
       empSalary = salary;
   }
   public double getSalary(){
       return empSalary;
   }
}
