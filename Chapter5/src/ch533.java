import java.util.Scanner;
public class ch533 {
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        double amount, principal = 1000000000, rate = 0.04;
        int month;
        System.out.print("\nEnter a number of months: ");
            month = input.nextInt();
        System.out.printf("%s%20s%n", "Months", "Facebook Users");
        for (int count = 0; count <= month ; ++ count)
        {
            amount = principal * Math.pow(1.0 + rate, count);
            System.out.printf("%4d\t%,20.2f%n", count, amount);                    
        }
    }   
    
}
