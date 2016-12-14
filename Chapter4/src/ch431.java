import java.util.Scanner;
public class ch431 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int biNumber;
        int multiplier = 1;
        int decimalNum = 0;
        int remainder;
        
        System.out.println("Enter a binary number to translate: ");
        biNumber = input.nextInt();
        
        while (biNumber > 0){
            remainder = biNumber % 10;
            decimalNum += multiplier * remainder;
            biNumber = biNumber/10;
            multiplier = multiplier *2;
        } 
        System.out.printf("\nThe decimal equivalent of the given binary number is %d\n", decimalNum);
        
    }   
    
}
