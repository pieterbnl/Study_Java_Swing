package com.pbe;

/** Study on Java SWING
 @author Pieter Beernink
 @version 1.0
 @since 1.0
 */


// *********************
// JFC & SWING
// *********************
// JFC is short for Java Foundation Classes.
// It encompass a group of features for building graphical user interfaces (GUIs) and adding rich graphics functionality and interactivity to Java applications.
// Supported features:
// - Swing GUI Components: buttons, split panes, tablets, with each component supported with all kind of features
// - Pluggable Look-and-Feel Support: look & feel can be customized
// - Accessibility API: enabling assistive technologies
// - Java 2D API: to easily incorporate 2D graphics, text, and images in applications and applets
// - Internationalization: build applications that can operate in any language and cultural convention

// The Swing API consists of 18 public packages. Most programs use only a small subset of the API.


import javax.swing.*;

// Oracle Hello World example with Swing
public class HelloWorldSwing {

    private static void createAndShowGUI() {

        // Create and setup a window
        // JFrame is a commonly used basic display window that you can place other Swing components on to build a UI
        // JFrame is a top level window, complete with title and border. It acts like a container that holds and displays components.
        // Swing provides 3 top-level containers: JFrame, JDialog (dialog windows), JApplet (window in browser - deprecated)
        // When adding a component to a JFrame, it's actually added to a 'panel container'.
        // Every JFrame has a panel which is the main display area of the window. I.e. everything below the title bar.
        // JFrame contains another container that can be used to add a menu to the window.
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