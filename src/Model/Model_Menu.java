
package Model;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Model_Menu {

    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public Menutype getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Menutype type) {
        this.type = type;
    }

    public Model_Menu(String icon, String name, Menutype type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }
    
    private String icon;
    private String name;
    private Menutype type;

    public Model_Menu() {
    }
    
    public Icon toIcon(){
        return new ImageIcon(getClass().getResource("/com/da/icon/" +icon+ ".png"));
    }
    public static enum Menutype{
        MENU, TITLE, EMPTY
    }
    
}
