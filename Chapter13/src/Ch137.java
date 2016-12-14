
import javax.swing.JFrame;




class ConcentricCircleGraphics2D extends JFrame
{
  public static void main (String args[])
  {
    JFrame frame = new JFrame("ConcentricCircleusing2D");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    CirclesJPanel circlesJPanel = new CirclesJPanel();
    frame.add(circlesJPanel);
    frame.setSize(300,300);
    frame.setVisible(true);
                              
  }
}  
                             
    