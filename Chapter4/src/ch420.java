import java.util.Scanner;
public class ch420 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int employeeCount = 1;
        int hoursWorked = 1;
        int overtimeHours;
        double payRate;
        double overPayRate;
        double overtimePay;
        double grossPay;
        

        
        while (hoursWorked > 0){
            System.out.print("Enter the amount of hours this employee worked: ");
            hoursWorked = input.nextInt();
            System.out.print("Enter the pay rate for this employee: $");
            payRate = input.nextDouble();
            overPayRate = payRate * 1.5;
            if (hoursWorked > 40){
                overtimeHours = hoursWorked - 40;
                overtimePay = overPayRate * overtimeHours;
                grossPay = (40 * payRate) + overtimePay;
                
            }
            else
                grossPay = hoursWorked * payRate;
            System.out.printf("Employee %d\n\nGross Pay: $%.2f", employeeCount, grossPay);
            System.out.print("\nDo you wish to add another employee? (1 for yes/0 for no) ");
            hoursWorked = input.nextInt();
        }
        System.out.print("Goodbye");
    }
    
}
