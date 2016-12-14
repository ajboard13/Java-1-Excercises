

 public class Quadrilateral {
   private int[] sides = new int[4];

    public Quadrilateral(int[] sides) {
        this.sides = sides;
    }

    public int[] getSides() {
        return sides;
    }

    public void setSides(int[] sides) {
        this.sides = sides;
    }


    public int getPerimeter(){
        int perimeter = 0;
        for (int i =0; i<=3; i++)
            perimeter = perimeter + sides[i];
        return perimeter;
    }
   
}
