import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class DrawCircle extends JFrame {
    private JTextArea Display_output;

    public DrawCircle(){
        super ("Circle");
        CircleCalculations CircleCalc = new CircleCalculations();
        Display_output = new JTextArea(5, 30);
        Display_output.setEditable(false);
        Display_output.setText(" The Radius is: "
                +CircleCalc.getRadius()+"\n The diameter is: "
                + CircleCalc.getDiameter()+"\n The Area is: "
                +CircleCalc.getArea()+ "\n The Cicumference is: "
                + CircleCalc.getCircumference());
        Container container = getContentPane();
        container.add(CircleCalc, BorderLayout.CENTER);
        container.add(Display_output, BorderLayout.SOUTH);
        setSize(200,300);
        setVisible(true);
    }
}
