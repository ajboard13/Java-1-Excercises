import javax.swing.JPanel;
import java.awt.Graphics;

public class CircleCalculations extends JPanel{
    private int radius = 150;
    public CircleCalculations() {
        setSize(200,200);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    

    public int getRadius() {
        return radius;
    }
    
    @Override
    public void paintComponent( Graphics g){
        g.drawOval(0, 0, 2* radius, 2* radius);
    }
    
    public int getDiameter(){
        return (int)(radius*2);
    }
    
    public double getCircumference(){
        return (double) (2* Math.PI * radius);
    }
    
    public double getArea(){
        return (double)(Math.PI * (radius *radius));
    }
}
