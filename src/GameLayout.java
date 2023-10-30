import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GameLayout {

    private final Dimension numberButtonSize = new Dimension(50, 50);
    private final Dimension labelSize = new Dimension(250, 40);
    private final Color color1 = new Color(164, 201, 255);
    private final Color color2 = new Color (164, 255, 185);
    private final Color grey = new Color(207, 209, 212);
    private final Color pink = new Color(247, 190, 220);
    private final Color green = new Color(240, 229, 177);
    private final Color blue = new Color(197, 219, 250);
    private final Font numberButtonFont = new Font("Roboto", Font.BOLD, 25);
    private final Font regularFont = new Font("Roboto", Font.PLAIN, 16);
    private final Border thinBorder = BorderFactory.createLineBorder(Color.black, 2);

    public Dimension getNumberButtonSize () {
        return numberButtonSize;
    }
    public Dimension getLabelSize () {
        return labelSize;
    }
    public void setTopLabelLayout (JLabel label) {
        label.setOpaque(true);
        label.setBackground(grey);
        label.setPreferredSize(labelSize);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setFont(regularFont);
        label.setBorder(thinBorder);
    }
    public void setNumberButtonLayout (JButton button) {
        button.setPreferredSize(numberButtonSize);
        button.setBackground(Color.white);
        button.setFont(numberButtonFont);
        button.setMargin(new Insets(2, 2, 2, 2));
        button.setBorder(thinBorder);
    }
    public Color getColor2 () {
        return pink;
    }
    public void setShuffleButtonLayout (JButton button) {
        button.setBackground(grey);
        button.setFont(regularFont);
        button.setBorder(thinBorder);
    }
}
