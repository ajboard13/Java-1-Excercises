
import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);
        
        System.out.printf("%s balance: %n%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %n%.2f%n",
                account2.getName(), account2.getBalance());
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdding %.2f to account1 balance%n%n", 
                depositAmount);
        account1.withdraw(depositAmount);
        
        System.out.print("Enter a withdrawel amount for account1: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%nwithdrawing %.2f from account1 balance%n%n", 
                withdrawAmount);
        account1.withdraw(withdrawAmount);
        
        
        System.out.printf("%s balance: %n%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %n%.2f%n",
                account2.getName(), account2.getBalance());
                        

        System.out.printf("account1 name is: %n%s%n",
                account1.getName());
        System.out.printf("account2 name is: %n%s%n",
                account2.getName());

    }

}
