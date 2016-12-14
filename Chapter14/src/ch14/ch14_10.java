
package ch14;
import java.util.Scanner;

public class ch14_10 {
    public static void main(String[] args) {
        String in, upper, lower;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        in = input.nextLine();
        upper = in.toUpperCase();
        lower = in.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);
    }
    
}
