import javax.swing.*;

  
  class CubeTest extends JFrame
  {
    public static void main( String args[])
    {
      JFrame frame = new JFrame("Cube");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      Cube app = new Cube();
      frame.add(app);
      
      frame.setSize(300,300);
      frame.setVisible(true);
    }
  }