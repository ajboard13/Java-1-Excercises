import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyColorChooser extends JPanel {
    private JSlider redSlider, blueSlider, greenSlider;
    private JTextField redDisplay, blueDisplay, greenDisplay;
    private JLabel redLabel, blueLabel, greenLabel;
    
    private Color color;
    
    public MyColorChooser(){
        redLabel = new JLabel("Red: ");
        redSlider = new JSlider(SwingConstants.HORIZONTAL,0,255,1);
        redDisplay = new JTextField("0", 4);
        redDisplay.setEditable(false);
        
        blueLabel = new JLabel("Blue: ");
        blueSlider = new JSlider(SwingConstants.HORIZONTAL,0,255,1);
        blueDisplay = new JTextField("0", 4);
        blueDisplay.setEditable(false);
        
        greenLabel = new JLabel("Green: ");
        greenSlider = new JSlider(SwingConstants.HORIZONTAL,0,255,1);
        greenDisplay = new JTextField("0", 4);
        greenDisplay.setEditable(false);
        
        setLayout (new GridLayout(3,3));
        
        add(redLabel);
        add(redSlider);
        add(redDisplay);
        
        add(greenLabel);
        add(greenSlider);
        add(greenDisplay);
        
        add(blueLabel);
        add(blueSlider);
        add(blueDisplay);
        
        redSlider.addChangeListener(new ChangeHandler());
        greenSlider.addChangeListener(new ChangeHandler());
        blueSlider.addChangeListener(new ChangeHandler());
        
        color = Color.BLACK;
        setSize(300,400);
        setVisible(true);
    }

    public JSlider getRedSlider() {
        return redSlider;
    }

    public JSlider getBlueSlider() {
        return blueSlider;
    }

    public JSlider getGreenSlider() {
        return greenSlider;
    }

    public Color getColor() {
        return color;
    }
    
    private class ChangeHandler implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent ce) {
            int red = redSlider.getValue();
            int green = greenSlider.getValue();
            int blue = blueSlider.getValue();
            color = new Color(red, green, blue);
            redDisplay.setText(String.valueOf(red));
            greenDisplay.setText(String.valueOf(green));
            blueDisplay.setText(String.valueOf(blue));
        }
        
    }
}
