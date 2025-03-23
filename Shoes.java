import javax.swing.*;
import java.awt.*;

class Shoes extends Pants {
    protected ImageIcon shoesImage = new ImageIcon("shoe.png");

    public Shoes() {
        description += "Wears blue shoes.";
    }

    @Override
    public JLabel getImageLabel() {
        return new JLabel(shoesImage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Wears blue shoes.";
    }
}