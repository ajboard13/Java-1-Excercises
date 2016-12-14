import javax.swing.*;
  
  class randomlines extends JFrame
  {
    public static void main( String args[])
    {
      JFrame frame = new JFrame("RandomeLines");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      Lines app = new Lines();
      frame.add(app);
      
      frame.setSize(300,300);
      frame.setVisible(true);
    }
  }