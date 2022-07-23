
package Component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setOpaque(false); 
        list_MenuItem1.setOpaque(false);
        init();
    }

    private void init(){
        list_MenuItem1.addItem(new Model_Menu("", " Features", Model_Menu.MenuType.TITLE));
        list_MenuItem1.addItem(new Model_Menu("01", "Pin Point", Model_Menu.MenuType.MENU));
        list_MenuItem1.addItem(new Model_Menu("02", "See us", Model_Menu.MenuType.MENU));
        list_MenuItem1.addItem(new Model_Menu("03", "we Can buil ", Model_Menu.MenuType.MENU));
        list_MenuItem1.addItem(new Model_Menu("06", "We Can Design", Model_Menu.MenuType.MENU));
         list_MenuItem1.addItem(new Model_Menu("06", "We are good", Model_Menu.MenuType.EMPTY));
      
        list_MenuItem1.addItem(new Model_Menu("", "CallmeSammy", Model_Menu.MenuType.TITLE));
         list_MenuItem1.addItem(new Model_Menu("3", "We create", Model_Menu.MenuType.MENU));
        list_MenuItem1.addItem(new Model_Menu("4", "We Are Unique", Model_Menu.MenuType.MENU));
         list_MenuItem1.addItem(new Model_Menu("8", "Just Good", Model_Menu.MenuType.MENU));
        list_MenuItem1.addItem(new Model_Menu("9", "We are Making", Model_Menu.MenuType.MENU));
      
         
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new Swing.button();
        list_MenuItem1 = new Component.List_MenuItem<>();

        button1.setBorder(null);
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sammy/image/user.png"))); // NOI18N
        button1.setText("SansseriF");
        button1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        button1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        list_MenuItem1.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(list_MenuItem1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list_MenuItem1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g7 = new GradientPaint(0, 0, Color.decode("#1CB5E0"), 0, getHeight(), Color.decode("#000046"), true);
        g2.setPaint(g7);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 22, 22);
        g2.fillRect(getWidth()-22, 0, getWidth(), getHeight());
        super.paintComponent(g); 
    }

   
          
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.button button1;
    private Component.List_MenuItem<String> list_MenuItem1;
    // End of variables declaration//GEN-END:variables
}
