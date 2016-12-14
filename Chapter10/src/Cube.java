public class Cube extends ThreeDimensionalShape{
    // constructor
    public Cube(double length){
        super(length);
    }
    // GETTERS
    @Override
    public double getArea(){
        return 6 * Math.pow(super.getLength(), 2);
    }
    @Override
    public double getVolume(){
        return Math.pow(super.getLength(), 3);
    }
    // String representation of object
    @Override
    public String toString(){
        return String.format("%s: %.2f\n%s:%.2f\n",
                "Area", getArea(), "Volume", getVolume());
    }
}