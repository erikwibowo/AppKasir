/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author erikw
 */
public class Notif {
    private Component component;
    
    public Notif(Component component){
        this.component = component;
    }
    
    public void information(String message){
        JOptionPane.showMessageDialog(component, message,
                            "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void message_dialog(String message){
        JOptionPane.showMessageDialog(component, message);
    }
}
