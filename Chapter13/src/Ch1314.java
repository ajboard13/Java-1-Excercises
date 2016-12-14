import javax.swing.*;


  
  class Grid2_10by10test extends JFrame
  {
    public static void main( String args[])
    {
      JFrame frame = new JFrame("10 by 10 Grid");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      Grid2_10by10 app = new Grid2_10by10();
      frame.add(app);
      
      frame.setSize(400,400);
      frame.setVisible(true);
    }
  }