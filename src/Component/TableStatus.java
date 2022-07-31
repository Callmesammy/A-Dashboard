
package Component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;


public class TableStatus extends JLabel{

    /**
     * @return the type
     */
    public StatusType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(StatusType type) {
        this.type = type;
    }

    public TableStatus() {
        setForeground(Color.WHITE);
    }
    
    private StatusType type;
    public void Staus(StatusType type){
        this.setType(type);
        setText(type.toString());
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (type != null) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gg;
            if (type == StatusType.APPROVED) {
                gg = new GradientPaint(0, 0, new Color(142,142,250), 0, getHeight(), new Color(123,123,245));
                
            }else if(type == StatusType.FAILED){
               gg = new GradientPaint(0, 0, new Color(186,123,247), 0, getHeight(), new Color(167,94,236));

            } else if (type == StatusType.PENDING){
               gg = new GradientPaint(0, 0, new Color(241,208,62), 0, getHeight(), new Color(211,184,61));

            }
        g2.setPaint(gg);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 22, 1);
        g2.fillRect(getWidth()-22, 0, getWidth(), getHeight());
            
        }
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
