
package Component;

import javax.swing.Icon;


public class Card_Model {

    /**
     * @return the icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    /**
     * @return the Value
     */
    public String getValue() {
        return Value;
    }

    /**
     * @param Value the Value to set
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Card_Model(Icon icon, String Value, String title, String Description) {
        this.icon = icon;
        this.Value = Value;
        this.title = title;
        this.Description = Description;
    }

    public Card_Model() {
    }
    
    private Icon icon;
    private String Value;
    private String title;
    private String Description;
    
}
