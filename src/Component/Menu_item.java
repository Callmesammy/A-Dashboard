
package Component;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Menu_item extends javax.swing.JPanel {

  

  private boolean selected;
  private Model_Menu data;
  
    public Menu_item(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if (data.getType()==Model_Menu.MenuType.MENU) {
            ibicon.setIcon(data.toIcon());
            ibiname.setText(data.getNeme());
        } else if (data.getType()==Model_Menu.MenuType.TITLE) {
            ibicon.setText(data.getNeme());
            ibicon.setFont(new Font("sansserif", 1, 12));
            ibiname.setVisible(true);
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

        ibicon.setBackground(new java.awt.Color(0, 0, 0));
        ibicon.setForeground(new java.awt.Color(255, 255, 255));

        ibiname.setBackground(new java.awt.Color(0, 0, 0));
        ibiname.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(ibicon)
                .addGap(11, 11, 11)
                .addComponent(ibiname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ibicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ibiname, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        if (selected){
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(new Color(255,255,255,80));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(10, 0, getWidth()-22, getHeight(), 5, 5);
     
        }
       
        super.paintComponent(g); 
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibicon;
    private javax.swing.JLabel ibiname;
    // End of variables declaration//GEN-END:variables
}
