import java.util.Scanner;
public class ch620 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double r;
        double area;
        System.out.print("Enter the radius of the circle in feet: ");
        r = input.nextDouble();
        
        area = circleArea(r);
        System.out.printf("The area of circle is %.2f square feet\n", area);
    }
    public static double circleArea (double r){
        double area;
        area = Math.PI * r;
        area = Math.pow(area, 2);
        
        return area;
    }
}
