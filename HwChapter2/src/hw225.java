import java.util.Scanner;

public class hw225 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        
        System.out.print("Enter a number: ");
        number = input.nextInt();
        
        if ((number % 2) > 0)
            System.out.printf("%n%d is not even%n", number);
        else 
            System.out.printf("%n%d is even%n", number);
    }
    
}
