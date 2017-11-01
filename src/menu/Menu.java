/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import javax.swing.*;

/**
 *
 * @author user
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleFrame frame = new SimpleFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // TODO code application logic here
    }

}

class SimpleFrame extends JFrame {

    public SimpleFrame() {
        setSize(DEAULT_WIGHT, DEAULT_HEIGHT);
    }
    public static final int DEAULT_WIGHT = 300;
    public static final int DEAULT_HEIGHT = 200;
}
