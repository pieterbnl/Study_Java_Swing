package com.pbe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI extends JFrame {

    private JPanel mainPanel;
    private JButton btnCalculate;
    private JPanel CelsiusConverterGUI;
    private JTextField txtCelsius;
    private JLabel lblCelsius;
    private JButton btnConvert;
    private JLabel lblFahrenheit;

    public CelsiusConverterGUI(String title) {
        super(title);
        this.setContentPane(mainPanel);
        this.pack();

        //  Objects can respond to an event like a button click, for which special methods can be written. This allows the object o react to occurrences.
        btnCalculate.addActionListener(new ActionListener() { // actionlistener to initiate a certain response when an user performs a certain operation
            @Override
            public void actionPerformed(ActionEvent e) { // actionPerformed captures the action and sends it to all action listeners that are registered on the relevant component
                JOptionPane.showMessageDialog(null, "Hello World!"); // the action to be carried out, in this case bringing up an information-message dialog with Hello World message
            }
        });
    }

    public CelsiusConverterGUI() {

        btnConvert.addActionListener(new ActionListener() { // actionlistener to initiate a certain response when an user performs a certain operation
            @Override
            public void actionPerformed(ActionEvent e) { // actionPerformed captures the action and sends it to all action listeners that are registered on the relevant component
//                JOptionPane.showMessageDialog(null, "Hello World!"); // the action to be carried out, in this case bringing up an information-message dialog with Hello World message
                // grab user celsius input from textfield and convert to fahrenheit
                int fahrenheit = (int) (Double.parseDouble(txtCelsius.getText()) * 1.8 + 32);
                lblFahrenheit.setText(fahrenheit + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Celsius to Fahrenheit Converter GUI"); // // JFrame is a type of container (inherits java.awt.Frame class) which works like the main window where components like labels, buttons, etc. are added to create a GUI
        frame.setContentPane(new CelsiusConverterGUI().CelsiusConverterGUI); // sets the contentPane property - hmmm
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets operation that will be executed by default when user initiates a close on the frame
        frame.pack(); // causes window to be sized to fit the preferred size and layouts of its subcomponents
        frame.setVisible(true); // shows or hides window depending on parameter, which in this case is: true!
    }


}
