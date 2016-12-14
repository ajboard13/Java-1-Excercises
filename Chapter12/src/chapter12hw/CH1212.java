
package chapter12hw;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CH1212 extends JFrame{
    private JPanel container;
    private JPanel conversionPane;

    private Font f;

    private JTextField inputField;
    private JLabel outputLabel;
    private JLabel titleLabel;

    private TemperatureConversion tc = new TemperatureConversion();


    public CH1212(){
        super("Temperature Converter");

        createElements();

        add(container);
    }

    private void createElements(){
        container = new JPanel(new BorderLayout(5, 5));
        conversionPane = new JPanel();

        f = new Font("Sans-Serif", Font.PLAIN, 30);

        // title
        titleLabel = new JLabel("Fahrenheit to Celsius temperature conversion", SwingConstants.CENTER);

        // input
        inputField = new JTextField(3);
        inputField.setFont(f);

        // register event handler
        TextFieldHandler handler = new TextFieldHandler();
        inputField.addActionListener(handler);

        outputLabel = new JLabel("??");
        outputLabel.setFont(f);

        conversionPane.add(inputField);
        conversionPane.add(outputLabel);

        container.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 10));
        container.add(titleLabel, BorderLayout.PAGE_START);
        container.add(conversionPane, BorderLayout.CENTER);
    }

    private class TextFieldHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            double baseTemp = 0.0f;
            double conversion = 0.0f;

            if(event.getSource() == inputField){
                try{
                    baseTemp = Double.parseDouble(event.getActionCommand());
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, e);
                }
                conversion = tc.fahrenheitToCelsius(baseTemp);
                outputLabel.setText(String.format("%.2f", conversion));
            }
        }
    }

}
