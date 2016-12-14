
package chapter12hw;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class ch1210 extends JFrame {
    private JButton Button_ok, Button_cancel;
    private JCheckBox background, foreground;
    private JComboBox colorList;
    private JPanel panel, panel2;
    
    public ch1210() {
        super ( "Ch1210" );
        getContentPane().setLayout(new BorderLayout ());
        colorList = new JComboBox();
        colorList.addItem("RED");
        getContentPane().add(colorList, BorderLayout.NORTH);
        
        panel = new JPanel();
        background = new JCheckBox( "Background ");
        foreground = new JCheckBox( "Foreground" );
        panel.add(background);
        panel.add(foreground);
        getContentPane().add(panel, BorderLayout.CENTER);
        Button_ok = new JButton("Ok");
        Button_cancel = new JButton("Cancel");
        panel2 = new JPanel();
        panel2.add(Button_ok);
        panel2.add(Button_cancel);
        getContentPane().add(panel2, BorderLayout.SOUTH);
        setSize(300,125);
        setVisible(true);
    }
    
}
