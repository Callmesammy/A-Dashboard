
package Swing;

import java.awt.Cursor;

import javax.swing.JButton;

/**
 *
 * @author user
 */
public class button extends JButton{

    public button() {
        setContentAreaFilled(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });
    }
    
    
  
}

