import javax.swing.*;
import java.awt.*;

public class CharacterBuilder {
    public static void main(String[] args) {
        // Create final character
        Shoes character = new Shoes();

        // Set up frame
        JFrame frame = new JFrame("Character Builder");
        frame.setSize(2000, 3000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // We'll set coordinates manually

        // Add image layers (same x/y so they stack)
        JLabel headLabel = character.headImage == null ? null : character.getImageLabel();
        JLabel shirtLabel = new JLabel(character.shirtImage);
        JLabel pantsLabel = new JLabel(character.pantsImage);
        JLabel shoesLabel = new JLabel(character.shoesImage);

        // Adjust positions
        headLabel.setBounds(600, 0, 360, 360);
        shirtLabel.setBounds(50, 360, 1200, 1200);
        pantsLabel.setBounds(50, 1560, 1300, 1300);
        shoesLabel.setBounds(600, 2860, 600, 600);

        // Add to frame
        frame.add(headLabel);
        frame.add(shirtLabel);
        frame.add(pantsLabel);
        frame.add(shoesLabel);

        // Add description
        JLabel descriptionLabel = new JLabel("<html><body style='width:280px'>" + character.getDescription() + "</body></html>");
        descriptionLabel.setBounds(0, 0, 280, 50);
        frame.add(descriptionLabel);

        frame.setVisible(true);
    }
}
