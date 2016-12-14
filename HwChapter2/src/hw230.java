import java.util.Scanner;

public class hw230 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        int digit1;
        int digit2;
        int digit3;
        int digit4;
        int digit5;
        
        System.out.print("Enter a number containing 5 digits (ex: 12345): ");
        number = input.nextInt();
        
        digit5 = number % 10;
        digit4 = (number % 100) / 10;
        digit3 = (number %1000) / 100;
        digit2 = (number % 10000) / 1000;
        digit1 = (number % 100000) / 10000;
        
        System.out.printf("%n%d   %d   %d   %d   %d%n", digit1, digit2, digit3, digit4, digit5);
                
        
    }
    
}
