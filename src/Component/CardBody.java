/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component;

/**
 *
 * @author user
 */
public class CardBody extends javax.swing.JPanel {

    /**
     * Creates new form CardBody
     */
    public CardBody() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        card2 = new Component.Card();
        card3 = new Component.Card();
        card1 = new Component.Card();

        setBackground(new java.awt.Color(237, 238, 243));

        jLayeredPane1.setLayout(new java.awt.GridLayout(1, 0, 6, 0));

        card2.setColor1(new java.awt.Color(142, 142, 250));
        card2.setColor2(new java.awt.Color(123, 123, 245));
        jLayeredPane1.add(card2);

        card3.setColor1(new java.awt.Color(186, 142, 250));
        card3.setColor2(new java.awt.Color(167, 94, 236));
        jLayeredPane1.add(card3);

        card1.setColor1(new java.awt.Color(241, 208, 62));
        card1.setColor2(new java.awt.Color(211, 184, 61));
        jLayeredPane1.add(card1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Component.Card card1;
    private Component.Card card2;
    private Component.Card card3;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
