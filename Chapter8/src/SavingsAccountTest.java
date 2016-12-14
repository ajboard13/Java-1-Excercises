import java.util.Scanner;
public class SavingsAccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        double saver1balance = saver1.getSavingsBalance();
        double saver2balance = saver2.getSavingsBalance();
        
        SavingsAccount.modifyInterestRate();
        double interestRate = SavingsAccount.getInterestRate();
        
        saver1balance = saver1.calculateYearlyInterest(interestRate, saver1balance);
        saver2balance = saver2.calculateYearlyInterest(interestRate, saver2balance);
        System.out.printf("\nSaver 1\nBalance after 1 year at an interest rate of %%%.2f: %.2f\n",interestRate, saver1balance);
        System.out.printf("\nSaver 2\nBalance after 1 year at an interest rate of %%%.2f: %.2f\n",interestRate, saver2balance);
        
        System.out.print("\nIs there a new annual interest rate?(y or n) ");
        String newint = input.next();
        if ("y".equals(newint)){
            SavingsAccount.modifyInterestRate();
            saver1balance = saver1.calculateMonthlyInterest(interestRate, saver1balance);
            saver2balance = saver2.calculateMonthlyInterest(interestRate, saver2balance);
            System.out.printf("\nSaver 1\nBalance after 1 month at a new interest rate of %%%.2f: %.2f\n",interestRate, saver1balance);
            System.out.printf("\nSaver 2\nBalance after 1 month at a new interest rate of %%%.2f: %.2f\n",interestRate, saver2balance);
        }
        
    }   
}
