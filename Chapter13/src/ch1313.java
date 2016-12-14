import javax.swing.*;

  
  class Grid extends JFrame
  {
    public static void main( String args[])
    {
      JFrame frame = new JFrame("Grid");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      Grids app = new Grids();
      frame.add(app);
      
      frame.setSize(300,300);
      frame.setVisible(true);
    }
  }