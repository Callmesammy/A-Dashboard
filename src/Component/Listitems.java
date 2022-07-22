/*
/*
02.0ses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Component;

import Model.Model_Menu;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author user
 */
public class Listitems <E extends Object> extends JList<E>{

    private final DefaultListModel model;
    private int selectedindex = -1;
    
    public Listitems() {
         model = new DefaultListModel();
        setModel(model);
       
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean selected, boolean cellHasFocus) {
                Model_Menu data;
                if(value instanceof Model_Menu){
                    data = (Model_Menu)value;
                }else{
                    data = new Model_Menu("", value+ "", Model_Menu.Menutype.EMPTY);
                }
                Menuitem item = new Menuitem(data);
                item.setSelected(selectedindex == index);
                return item;
            }
            
        };
    }
    public void addItem(Model_Menu data){
        model.addElement(data);
    }
    
    
    
}
