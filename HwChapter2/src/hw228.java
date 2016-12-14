import java.util.Scanner;

public class hw228 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int radius;
        int radius2;
        
        System.out.print("Enter a radius: ");
        radius = input.nextInt();

        
        System.out.printf("%nThe Diameter is %d", (radius * 2));
        System.out.printf("%nThe Circumference is %f", (radius * Math.PI));
        System.out.printf("%nThe Area is %f%n", (radius * radius * Math.PI));
        
        
        
                
    }
}
