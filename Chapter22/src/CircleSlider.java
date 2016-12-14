import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.basic.BasicMenuUI;

public class CircleSlider extends JFrame{
    private CircleCalculations CircleCalc;
    private JTextArea Display_output;
    private JPanel controlPanel;
    private JSlider radiusSlider;
    
    public CircleSlider(){
        CircleCalc = new CircleCalculations();
        Display_output = new JTextArea(5, 30);
        
        Display_output.setText(" The Radius is: "
                +CircleCalc.getRadius()+"\n The diameter is: "
                + CircleCalc.getDiameter()+"\n The Area is: "
                +CircleCalc.getArea()+ "\n The Cicumference is: "
                + CircleCalc.getCircumference());
        
        radiusSlider = new JSlider(SwingConstants.HORIZONTAL, 100, 200, 150);
        radiusSlider.setMajorTickSpacing(10);
        radiusSlider.setPaintTicks(true);
        radiusSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                CircleCalc.setRadius(radiusSlider.getValue());
                    Display_output.setText(" The Radius is: "
                    +CircleCalc.getRadius()+"\n The diameter is: "
                    + CircleCalc.getDiameter()+"\n The Area is: "
                    +CircleCalc.getArea()+ "\n The Cicumference is: "
                    + CircleCalc.getCircumference());
                    repaint();
            }
        });
        
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(2,1));
        controlPanel.add(Display_output);
        controlPanel.add(radiusSlider);
        
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(CircleCalc, BorderLayout.CENTER);
        container.add(controlPanel, BorderLayout.SOUTH);
        setSize(450,600);
        setVisible(true);
    }
}
