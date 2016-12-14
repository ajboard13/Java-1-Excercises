
import java.util.Scanner;

public class ch430 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = 1;
        int digit1;
        int digit2;
        int digit4;
        int digit5;
        
        while (number > 0){
        System.out.print("Enter a number containing 5 digits (ex: 12345)(1 to continue/0 to quit): ");
        number = input.nextInt();
        
        digit5 = number % 10;
        digit4 = (number % 100) / 10;
        digit2 = (number % 10000) / 1000;
        digit1 = (number % 100000) / 10000;
        
        if (digit5 == digit1)
            if(digit4 == digit2)
                    System.out.printf("\nThe number %d is a palindrome\n", number);
        else
                    System.out.printf("\nThe number %d is not a palindrome, please try again\n", number);

        }
        System.out.print("Goodbye");
    }
}