import java.util.Scanner;
public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length = 0.0;
        double width = 0.0;
        Rectangle rectangle1 = new Rectangle(length, width);
        
        rectangle1.setLength(length);
        rectangle1.setWidth(width);
        width = rectangle1.getWidth();
        length = rectangle1.getLength();
        
        double perim = rectangle1.getPerim(width, length);
        double area = rectangle1.getArea(width, length);
        
        System.out.printf("\nArea: %.4f\nPerimeter: %.4f\n", area, perim);
    }
    
}
