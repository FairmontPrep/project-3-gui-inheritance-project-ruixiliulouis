import javax.swing.*;
import java.awt.*;

class Shirt extends Head {
    protected ImageIcon shirtImage;
    private boolean isRed;

    public Shirt() {
        if (Math.random() < 0.5) {
            shirtImage = new ImageIcon("shirt 2.png");
            description += "Wears a blue shirt. ";
            isRed = true;
        } else {
            shirtImage = new ImageIcon("shirt.png");
            description += "Wears a pink shirt. ";
            isRed = false;
        }
    }

    @Override
    public JLabel getImageLabel() {
        return new JLabel(shirtImage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + (isRed ? "Wears a blue shirt. " : "Wears a pink shirt. ");
    }
}