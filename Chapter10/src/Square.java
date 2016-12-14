public class Square extends TwoDimensionalShape{
    // constructor
    public Square(double length){
        super(length);
    }
    // GETTERS
    @Override
    public double getArea(){
        return Math.pow(super.getLength(),2);
    }
    // String representation
    @Override
    public String toString(){
        return String.format("%s: %.2f\n",
                "Area", getArea());
    }
}