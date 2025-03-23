import javax.swing.*;
import java.awt.*;

class Pants extends Shirt {
    protected ImageIcon pantsImage = new ImageIcon("pants.png");

    public Pants() {
        description += "Wears blue pants. ";
    }

    @Override
    public JLabel getImageLabel() {
        return new JLabel(pantsImage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Wears blue pants. ";
    }
}