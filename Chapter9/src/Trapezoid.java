
public class Trapezoid extends Quadrilateral{
    private double base1;
    private double base2;
    private double height;

 public Trapezoid(int[] sides) {
        super(sides);
    }

    public double getBase1() {
        int[] lengths = super.getSides();
        for (int i = 0; i <= 3; i++){
            if (i == 0)
                base1 = lengths[i];
            else
                if(lengths[i] < base1)
                    base1 = lengths[i];
        }
        return base1;
    }
    
    public double getBase2() {
        int[] lengths = super.getSides();
        for (int i = 0; i <= 3; i++){
            if (i == 0)
                base2 = lengths[i];
            else
                if(lengths[i] > base2)
                    base2 = lengths[i];
        }
        return base2;
    }
    
    public double getHeight(){
        int[] lengths = super.getSides();
        double length1 = 0;
        double length2 = (base2 - base1)/2;
        for (int i = 0; i <= 3; i++){
            if (lengths[i] != base1 && lengths[i] != base2)
                length1 = lengths[i];    
        }
        height = Math.sqrt(length1*length1 + length2 *length2);
        return height;
    }

    public void setBase1(int base1) {
        this.base1 = base1;
    }

    public void setBase2(int base2) {
        this.base2 = base2;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea(){
        double area;
        area = this.getHeight() * ((this.getBase1()+this.getBase2())/2);
        return area;
    }
    
}
