package com.pbe;

/** Study on Java SWING
 @author Pieter Beernink
 @version 1.0
 @since 1.0
 */


import javax.swing.*;

// Oracle Hello World example with Swing
public class HelloWorldSwing {

    private static void createAndShowGUI() {

        // Create and setup a window
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add "Hello World" label
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        // Display window
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread: creating and showing GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}