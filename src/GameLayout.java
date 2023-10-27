import javax.swing.*;
import java.awt.*;

public class GameLayout {

    private final Dimension numberButtonSize = new Dimension(50, 50);
    private final Dimension labelSize = new Dimension(250, 40);
    private final Color color1 = new Color(164, 201, 255);
    private final Color color2 = new Color (164, 255, 185);
    private final Font numberButtonFont = new Font("Roboto", Font.BOLD, 25);
    private final Font regularFont = new Font("Roboto", Font.PLAIN, 16);

    public Dimension getNumberButtonSize () {
        return numberButtonSize;
    }
    public Dimension getLabelSize () {
        return labelSize;
    }
    public void setTopLabelLayout (JLabel label) {
        label.setOpaque(true);
        label.setBackground(color1);
        label.setPreferredSize(labelSize);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setFont(regularFont);
    }
    public void setNumberButtonLayout (JButton button) {
        button.setPreferredSize(numberButtonSize);
        button.setBackground(color1);
        button.setFont(numberButtonFont);
        button.setMargin(new Insets(2, 2, 2, 2));
    }
    public Color getColor2 () {
        return color2;
    }
    public void setShuffleButtonLayout (JButton button) {
        button.setBackground(color1);
        button.setFont(regularFont);
    }


}
