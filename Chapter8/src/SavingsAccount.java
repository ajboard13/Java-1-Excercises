import java.util.Scanner;
public class SavingsAccount {
    private static double interestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        SavingsAccount.interestRate = interestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    
    public double calculateMonthlyInterest(double interestRate, double savingsBalance){
        double monthlyInterest = (interestRate * savingsBalance)/12;
        savingsBalance += monthlyInterest;
        return savingsBalance;                
    }
    public double calculateYearlyInterest(double interestRate, double savingsBalance){
        double yearlyInterest = (interestRate * savingsBalance);
        savingsBalance += yearlyInterest;
        return savingsBalance;
    }
    public static void modifyInterestRate(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the new annual interest rate: ");
        interestRate = input.nextDouble();
        System.out.println("");
    }
    
}
