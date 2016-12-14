import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class Palette extends JApplet implements ChangeListener{
    private MyColorChooser colorChooser;
    private JPanel drawPanel;


    
    public void init(){
        colorChooser = new MyColorChooser();
        
        JSlider red = colorChooser.getRedSlider();
        red.addChangeListener(this);
        
        JSlider green = colorChooser.getGreenSlider();
        green.addChangeListener(this);
        
        JSlider blue = colorChooser.getBlueSlider();
        blue.addChangeListener(this);
        
        drawPanel = new JPanel();
        
        Container cont = getContentPane();
        cont.add(colorChooser, BorderLayout.SOUTH);
        cont.add(drawPanel, BorderLayout.CENTER);
        
        this.repaint();
        
    }

 
    
    @Override
    public void stateChanged(ChangeEvent ce) {
        draw();
    }
    
    private void draw(){
        Graphics g = drawPanel.getGraphics();
        g.setColor(colorChooser.getColor());
        g.fillRect(50, 50, 150, 150);
    }
    
    
    
    public void Paint (Graphics gg){
        super.paint(gg);
        draw();
    }
    
}
