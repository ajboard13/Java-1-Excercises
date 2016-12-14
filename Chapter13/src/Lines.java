import javax.swing.*;
import java.awt.*;

class Lines extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    for(int y = 10; y<200; y+=10) {
      int x1 = (int)(1+ Math.random() * 199);
      g.setColor (new Color((float) Math.random(), (float) Math.random(), (float) Math.random()));
      g.drawLine(1, y, x1, y);
    }
  }
}