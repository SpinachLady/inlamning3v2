import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GameLayout {

    private final Dimension numberButtonSize = new Dimension(100, 100);
    private final Dimension labelSize = new Dimension(250, 70);

    private final Color grey = new Color(207, 209, 212);
    private final Color pink = new Color(247, 190, 220);

    private final Font numberButtonFont = new Font("Roboto", Font.BOLD, 25);
    private final Font regularFont = new Font("Roboto", Font.BOLD, 26);
    private final Border borderStyle = BorderFactory.createLineBorder(Color.black, 3);

    public void setTopLabelLayout (JLabel label) {
        label.setOpaque(true);
        label.setBackground(grey);
        label.setPreferredSize(labelSize);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setFont(regularFont);
        label.setBorder(borderStyle);
    }
    public void setNumberButtonLayout (JButton button) {
        button.setPreferredSize(numberButtonSize);
        button.setBackground(Color.white);
        button.setFont(numberButtonFont);
        button.setMargin(new Insets(2, 2, 2, 2));
        button.setBorder(borderStyle);
    }
    public Color getPinkColor() {
        return pink;
    }
    public void setShuffleButtonLayout (JButton button) {
        button.setBackground(grey);
        button.setFont(regularFont);
        button.setBorder(borderStyle);
        button.setPreferredSize(new Dimension(300, 50));
    }
}
