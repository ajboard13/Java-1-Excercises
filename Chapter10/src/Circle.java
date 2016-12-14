public class Circle extends TwoDimensionalShape{
    // constructor
    public Circle(double radius){
        super(radius);
    }
    // GETTERS
    @Override
    public double getArea(){
        return Math.PI * Math.pow(super.getLength(), 2);
    }
    // String representation
    @Override
    public String toString(){
        return String.format("%s: %.2f\n",
                "Area", getArea());
    }
}