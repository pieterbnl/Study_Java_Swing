package com.pbe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI {
    private JButton btnCalculate;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JPanel CelsiusConverterGUI;

    public CelsiusConverterGUI() {
        btnCalculate.addActionListener(new ActionListener() { // actionlistener to initiate a certain response when an user performs a certain operation
            @Override
            public void actionPerformed(ActionEvent e) { // actionPerformed captures the action and sends it to all action listeners that are registered on the relevant component
                JOptionPane.showMessageDialog(null, "Hello World!"); // the action to be carried out, in this case bringing up an information-message dialog with Hello World message
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CelsiusConverterGUI"); // // JFrame is a type of container (inherits java.awt.Frame class) which works like the main window where components like labels, buttons, etc. are added to create a GUI
        frame.setContentPane(new CelsiusConverterGUI().CelsiusConverterGUI); // sets the contentPane property - hmmm
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets operation that will be executed by default when user initiates a close on the frame
        frame.pack(); // causes window to be sized to fit the preferred size and layouts of its subcomponents
        frame.setVisible(true); // shows or hides window depending on parameter, which in this case is: true!
    }
}
