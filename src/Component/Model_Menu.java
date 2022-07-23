
package Component;

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
     * @return the Neme
     */
    public String getNeme() {
        return Neme;
    }

    /**
     * @param Neme the Neme to set
     */
    public void setNeme(String Neme) {
        this.Neme = Neme;
    }

    /**
     * @return the Type
     */
    public MenuType getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(MenuType Type) {
        this.Type = Type;
    }
    private String icon;
    private String Neme;
    private MenuType Type;

    public Model_Menu(String icon, String Neme, MenuType Type) {
        this.icon = icon;
        this.Neme = Neme;
        this.Type = Type;
    }

    public Model_Menu() {
    }
    public Icon toIcon(){
        return new ImageIcon(getClass().getResource("/sammy/image/" +icon+ ".png"));
    }
    public static enum MenuType{
        MENU, TITLE, EMPTY
    }
}
