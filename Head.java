import javax.swing.*;
import java.awt.*;

class Head {
    protected String description = "Character: ";
    protected ImageIcon headImage = new ImageIcon("head.png");

    public String getDescription() {
        return description + "Has a head. ";
    }

    public JLabel getImageLabel() {
        return new JLabel(headImage);
    }
}