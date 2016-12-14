import javax.swing.*;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics;
import java.awt.Graphics2D;

class Grid2_10by10 extends JPanel
{
  public void paint(Graphics g)
  {
    super.paint(g);
    Graphics2D g2d=(Graphics2D) g;
    for(int x=30;x<=300;x+=30)
      for(int y=30;y<=300;y+=30)
      g2d.draw( new Rectangle2D.Double (x,y,30,30));
  }
}
  