import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("", "", 0.0);
        Employee employee2 = new Employee("", "", 0.0);
        
        Scanner input = new Scanner(System.in);
        
        String firstName;
        String lastName;
        double salary;
        
        System.out.print("Enter first employee's first name: ");
        firstName = input.nextLine();
        employee1.setFirstName(firstName);
        
        System.out.print("Enter first employee's last name: ");
        lastName = input.nextLine();
        employee1.setlastName(lastName);
        
        System.out.print("Enter first employee's monthly salary: ");
        salary = input.nextDouble();
        
        if (salary >=0)
            employee1.setSalary(salary);
        
        System.out.print("Enter second employee's first name: ");
        firstName = input.next();
        employee2.setFirstName(firstName);
        
        System.out.print("Enter second employee's last name: ");
        lastName = input.next();
        employee2.setlastName(lastName);
        
        System.out.print("Enter second employee's monthly salary: ");
        salary = input.nextDouble();
        
        if (salary >= 0)
            employee2.setSalary(salary);
        
        
        
        System.out.printf("\nEmployee 1 = %s %s\nYearly Salary = $%.2f\nYearly Salary with 10%% raise = $%.2f\n", 
                employee1.getFirstName(), employee1.getLastName(), (employee1.getSalary() * 12), (((employee1.getSalary() * 12) * 1.1)));
        
        System.out.printf("\nEmployee 2 = %s %s\nYearly Salary = $%.2f\nYearly Salary with 10%% raise = $%.2f\n", 
                employee2.getFirstName(), employee2.getLastName(), (employee2.getSalary() * 12), (((employee2.getSalary() * 12) * 1.1)));
        
        
        
    }
    
}
