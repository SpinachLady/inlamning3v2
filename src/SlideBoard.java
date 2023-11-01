import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class SlideBoard extends JFrame {
    GameLayout gameLayout = new GameLayout();
    JPanel frame = new JPanel();
    String heading = "FEMTONSPEL";
    JLabel top = new JLabel(heading);
    JButton newGameButton = new JButton("NYTT SPEL");
    JPanel a = new JPanel();JPanel b = new JPanel();JPanel c = new JPanel();JPanel d = new JPanel();
    JPanel e = new JPanel();JPanel f = new JPanel();JPanel g = new JPanel();JPanel h = new JPanel();JPanel i = new JPanel();JPanel j = new JPanel();
    JPanel k = new JPanel();JPanel l = new JPanel();JPanel m = new JPanel();JPanel n = new JPanel();JPanel o = new JPanel();JPanel p = new JPanel();
    JButton button1 = new JButton("1");JButton button2 = new JButton("2");JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");JButton button5 = new JButton("5");JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");JButton button8 = new JButton("8");JButton button9 = new JButton("9");
    JButton button10 = new JButton("10");JButton button11 = new JButton("11");JButton button12 = new JButton("12");
    JButton button13 = new JButton("13");JButton button14 = new JButton("14");JButton button15 = new JButton("15");
    JButton button16 = new JButton();
    JButton[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16};
    JButton[] buttonsInRightOrder = Arrays.copyOf(buttons, buttons.length);
    JPanel[] panels = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
    boolean isTest = true;


    public SlideBoard() {

        if (isTest) {
            buttons = Arrays.copyOf(buttonsInRightOrder, buttonsInRightOrder.length);
            swap(14, 15);
        } else {
            shuffle();
        }

        add(top, BorderLayout.NORTH);
        add(frame, BorderLayout.CENTER);
        add(newGameButton, BorderLayout.SOUTH);
        gameLayout.setTopLabelLayout(top);
        frame.setLayout(new GridLayout(4, 4));
        gameLayout.setShuffleButtonLayout(newGameButton);

        //PANELER & KNAPPAR LÄGGS TILL
        for (int i = 0; i < 16; i++) {
            frame.add(panels[i]);
        }
        addButtonsToPanels();

        //STYLING
        for (JPanel panel : panels) {
            panel.setBackground(gameLayout.getPinkColor());
        }
        for (JButton button : buttons) {
            gameLayout.setNumberButtonLayout(button);
        }

        //ACTION LISTENERS LÄGGS TILL
        for (JButton button : buttons) {
            button.addActionListener(new makeMoveListener());
        }
        newGameButton.addActionListener(new startNewGameListener());

        setVisible(true);
        button16.setVisible(false);
        newGameButton.setVisible(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (530, 600);
    }


    class startNewGameListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            top.setText(heading);
            newGameButton.setVisible(false);
            removeButtonsFromPanels();
            shuffle();
            addButtonsToPanels();
        }
    };

    class makeMoveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();

            int indexClickedButton = -1;
            for (int i = 0; i < buttons.length; i++) {
                if (buttons[i] == clickedButton) {
                    indexClickedButton = i;
                    break;
                }
            }

            boolean clickedButtonHasEmptySlotBesides = slotNextToIsEmpty(indexClickedButton);
            if (clickedButtonHasEmptySlotBesides) {
                int indexForEmptySlot = getIndexForEmptySlot();
                if (indexForEmptySlot != -1) {
                    swap(indexClickedButton, indexForEmptySlot);
                    if (hasWon()) {
                        top.setText("GRATTIS DU VANN!");
                        newGameButton.setVisible(true);
                    }
                }
            }
        }
    }

    private int getIndexForEmptySlot() {
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i] == button16) {
                return i;
            }
        }
        return -1; //Ifall tomma knappen inte hittas, alltså error.
    }

    private boolean slotNextToIsEmpty(int indexForClickedButton) {
        int indexForEmptySlot = getIndexForEmptySlot();

        /* Division med int avrundar alltid nedåt.
           Ex: indexForClickedButton = 7
           buttonRow = 7 / 4
           buttonRow = 1
           --> Befinner sig alltså på andra raden (rad 0 är första) */
        int buttonRow = indexForClickedButton / 4;

        /* Ex: indexForClickedButton = 15
               buttonCol = 15 % 4
               buttonCol = 3 --> den klickade knappen finns alltså
               på column 3. */
        int buttonCol = indexForClickedButton % 4;
        int emptyRow = indexForEmptySlot / 4;
        int emptyCol = indexForEmptySlot % 4;

        //buttonRow - emptyRow är antingen 0 eller 1. buttonCol - emptyCol kommer va det andra.
        //Därav blir resultatet alltid 1 ifall det finns en tom plats bredvid.
        return Math.abs(buttonRow - emptyRow) + Math.abs(buttonCol - emptyCol) == 1;
    }

    private void swap(int indexPushedButton, int indexEmptySlot) {
        removeButtonsFromPanels();
        JButton temp = buttons[indexPushedButton];
        buttons[indexPushedButton] = button16;
        buttons[indexEmptySlot] = temp;
        addButtonsToPanels();

    }

    private boolean hasWon() {
        for (int i = 0; i<buttons.length; i++) {
            if (!buttons[i].equals(buttonsInRightOrder[i])) {
                return false;
            }
        }
        return true;
    }

    private void addButtonsToPanels () {
        for (int i = 0; i<  16; i++) {
            panels[i].add(buttons[i]);
        }
    }

    private void removeButtonsFromPanels () {
        for (int i = 0; i<buttons.length; i++) {
            panels[i].removeAll();
            panels[i].revalidate();
            panels[i].repaint();
        }
    }

    private void shuffle() {
        JButton temp;
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 15);
            int random2 = (int) (Math.random() * 15);
            temp = buttons [random];
            buttons[random] = buttons [random2];
            buttons[random2] = temp;
        }
    }

}
