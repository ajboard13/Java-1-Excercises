public abstract class TwoDimensionalShape extends Shape{
    // constructor
    public TwoDimensionalShape(){
        super();
    }
    public TwoDimensionalShape(double length){
        super(length);
    }
    public TwoDimensionalShape(double length, double width){
        super(length, width);
    }
    // ABSTRACT METHODS
    // get area
    public abstract double getArea();
}