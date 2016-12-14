
public class Rectangle extends Quadrilateral{

 public Rectangle(int[] sides) {
        super(sides);
    }
    
    public int getArea(){
        int area;
        int[] side = super.getSides();
        area = side[0]*side[1];
        return area;
    }
    
}
