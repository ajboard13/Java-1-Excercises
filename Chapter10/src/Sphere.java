public class Sphere extends ThreeDimensionalShape{
    // constructor
    public Sphere(double radius){
        super(radius);
    }
    // GETTERS
    // surface area
    @Override
    public double getArea(){
        return 4.0f * Math.PI * Math.pow(super.getLength(), 2);
        //return Math.PI * Math.pow(super.getLength(), 2);
    }
    @Override
    public double getVolume(){
        return (4.0f / 3.0f) * Math.PI * Math.pow(super.getLength(), 3);
    }
    // String representation of object
    @Override
    public String toString(){
        return String.format("%s: %.2f\n%s:%.2f\n",
                "Area", getArea(), "Volume", getVolume());
    }
}