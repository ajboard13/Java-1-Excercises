import java.util.Scanner;
public class Rectangle {
    private double length = 1.0;
    private double width = 1.0;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = input.nextDouble();
        if (0.0 <= length)
            if (20.0 >= length)
                this.length = length;
            else{
                this.length = 0.0;
                System.out.println("INVALID LENGTH");
            }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        width = input.nextDouble();
        if (0.0 <= width)
            if (20.0 >= width)
                this.width = width;
        else{
                this.width = 0.0;
                System.out.println("INVALID WIDTH");
            }
    }
    public double getArea(double width, double length){
        double Area = length * width;
        return Area;
    }
    public double getPerim(double width, double length){
        double perim = width *2 +length * 2;
        return perim;
    }
}
