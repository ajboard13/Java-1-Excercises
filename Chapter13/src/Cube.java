import javax.swing.*;
import java.awt.geom.GeneralPath;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

class Cube extends JPanel
{
  public void paint(Graphics g)
  {
    super.paint(g);
    int base1x[] = {100,100,200,200,100};
    int base1y[] = {100,200,200,100,100};
    int base2x[] = {75,75,175,175,75};
    int base2y[] = {75,175,175,75,75};
    Graphics2D g2d=(Graphics2D) g;
    g2d.setColor(Color.red);
    GeneralPath cube=new GeneralPath();
    for(int i=1;i <=4; i++)
    {
      cube.moveTo ( base1x[i-1], base1y[i-1]);
      cube.lineTo(base1x[i], base1y[i]);
      cube.moveTo ( base2x[i-1], base2y[i-1]);
      cube.lineTo(base2x[i], base2y[i]);
      cube.moveTo(base1x[i], base1y[i]);
      cube.lineTo(base2x[i], base2y[i]);
    }
      g2d.draw(cube);
  }
}
