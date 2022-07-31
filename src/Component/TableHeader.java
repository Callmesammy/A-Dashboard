
package Component;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;


public class TableHeader extends JLabel{

    
    public TableHeader(String text) {
    super(text);
        setFont(new Font("sansserif", 1, 13));
        setOpaque(false);
        setBackground(Color.WHITE);
        setForeground(new Color(102,102,102));
        setBorder(new EmptyBorder(10,5,10,5));
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(230,230,230));
        g.drawLine(0, getHeight()-1, getWidth(), getHeight()-1);
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }


    
}
