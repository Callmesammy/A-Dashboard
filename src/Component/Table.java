
package Component;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class Table extends JTable{

    public Table() {
        setShowHorizontalLines(true);
        setRowHeight(30);
        setGridColor(new Color(230,230,230));
        getTableHeader().setReorderingAllowed(false);
       getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer()
       {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            TableHeader tab = new TableHeader(value+ "");  
                if (column == 1) {
                    tab.setHorizontalAlignment(JLabel.CENTER);
                                    }
            return tab;
            }
       });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if (column != 4) {
                
                   Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                   com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if (isSelected) {
                        setForeground(new Color(120,252,121));
                    }else{
                        com.setForeground(new Color(102,102,102));
                    }
                   return com;
                    
                }
                return  new JLabel("Testing");
            }
        });
    
    }
    
    
}
