import java.util.Scanner;
public class ch615 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double side1;
        double side2;
        double hypo;  
        System.out.print("Enter the length of the first side: ");
        side1 = input.nextDouble();
        System.out.print("Enter the length of the second side: ");
        side2 = input.nextDouble();
        hypo = Hypotenuse(side1, side2);
        
        System.out.println("\nThe length of the hypotenuse is " +  hypo);

}
public static double Hypotenuse(double x,double y){
            double hypo;
            
            x = Math.pow(x, 2);
            y = Math.pow(y, 2);
            
            hypo = x + y;
            hypo = Math.sqrt(hypo);
            return hypo;
}
}