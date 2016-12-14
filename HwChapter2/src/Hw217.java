import java.util.Scanner;

public class Hw217 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1;
        int number2;
        int number3;
        int sum;
        int average;
        int product;
        int smallest;
        int largest;
        
        
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        System.out.print("Enter third integer: ");
        number3 = input.nextInt();
        
        if (number1 < number2)
            if (number2 < number3)
            System.out.printf("%n%d is the lowest number%n", number1);
        if (number2 < number3)
            if (number2 < number1)
            System.out.printf("%n%d is the lowest number%n", number2);
        if (number3 < number1)
            if (number3 < number2)
            System.out.printf("%n%d is the lowest number%n", number3);
        
        sum = number1 + number2 + number3;
        average = sum/3;
        product = number1 * number2 * number3;
                
        
        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Average is %d%n", average);
        System.out.printf("Product is %d%n", product);
        
    }
    
}
