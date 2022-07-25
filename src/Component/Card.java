
package Component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;


public class Card extends javax.swing.JPanel {

    /**
     * @return the color1
     */
    public Color getColor1() {
        return color1;
    }

    /**
     * @param color1 the color1 to set
     */
    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    /**
     * @return the color2
     */
    public Color getColor2() {
        return color2;
    }

    /**
     * @param color2 the color2 to set
     */
    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    private Color color1;
    private Color color2;

    private Card_Model data;
    public Card() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
   
    }
    
    public void initItem(Card_Model data){
        ibicon.setIcon(data.getIcon());
        ibititle.setText(data.getTitle());
        ibivalue.setText(data.getValue());
        ibidescription.setText(data.getDescription());
        
  
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ibicon = new javax.swing.JLabel();
        ibititle = new javax.swing.JLabel();
        ibivalue = new javax.swing.JLabel();
        ibidescription = new javax.swing.JLabel();

        ibicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sammy/image/flame.png"))); // NOI18N

        ibititle.setBackground(new java.awt.Color(255, 255, 255));
        ibititle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        ibititle.setForeground(new java.awt.Color(255, 255, 255));
        ibititle.setText("TITLE");

        ibivalue.setBackground(new java.awt.Color(255, 255, 255));
        ibivalue.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ibivalue.setForeground(new java.awt.Color(255, 255, 255));
        ibivalue.setText("Value");

        ibidescription.setBackground(new java.awt.Color(255, 255, 255));
        ibidescription.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        ibidescription.setForeground(new java.awt.Color(255, 255, 255));
        ibidescription.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(ibidescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ibititle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ibicon, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(ibivalue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(51, 51, 51)))
                        .addGap(13, 13, 13)))
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ibicon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ibititle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ibivalue, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ibidescription, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents
 @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g7 = new GradientPaint(0, 0, color1, 0, getHeight(), color2, true);
        g2.setPaint(g7);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255,255,255,80));
        g2.fillOval(getWidth() -(getHeight()/2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() -(getHeight()/2-20), getHeight()/2 +20, getHeight(), getHeight());
        super.paintComponent(g);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibicon;
    private javax.swing.JLabel ibidescription;
    private javax.swing.JLabel ibititle;
    private javax.swing.JLabel ibivalue;
    // End of variables declaration//GEN-END:variables
}
