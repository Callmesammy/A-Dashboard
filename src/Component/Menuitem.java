
package Component;

import Model.Model_Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Menuitem extends javax.swing.JPanel {

   
    private Model_Menu data;
    
    private boolean selected;
    
    public Menuitem(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if (data.getType()==Model_Menu.Menutype.MENU) {
            ibicon.setIcon(data.toIcon());
            ibiname.setText(data.getName());
            
        }else if (data.getType()==Model_Menu.Menutype.TITLE) {
            ibicon.setText(data.getName());
            ibicon.setFont(new Font("sansserif", 1, 12));
            ibiname.setVisible(false);
        }else{
            ibiname.setText(" ");
        }
    }


      public void setSelected(boolean selected) {
        this.selected = selected;
          repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ibicon = new javax.swing.JLabel();
        ibiname = new javax.swing.JLabel();

        ibiname.setText("Enteryour name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ibicon, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ibiname, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ibicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ibiname, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
         if (selected) {
                Graphics2D g2 = (Graphics2D)g.create();
        g2.setColor(new Color(255,255,255,80));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 5, 5);
//        g2.fillRect(10, getWidth(), getHeight(), HEIGHT);
            
        }
        super.paintComponent(g); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibicon;
    private javax.swing.JLabel ibiname;
    // End of variables declaration//GEN-END:variables
}
