import javax.swing.*;
import java.awt.*;

public class SlideBoard extends JFrame {
    JPanel frame = new JPanel();
    JLabel top = new JLabel();
    JButton newGame = new JButton();JPanel a = new JPanel();JPanel b = new JPanel();JPanel c = new JPanel();JPanel d = new JPanel();
    JPanel e = new JPanel();JPanel f = new JPanel();JPanel g = new JPanel();JPanel h = new JPanel();JPanel i = new JPanel();JPanel j = new JPanel();
    JPanel k = new JPanel();JPanel l = new JPanel();JPanel m = new JPanel();JPanel n = new JPanel();JPanel o = new JPanel();JPanel p = new JPanel();
    JButton button1 = new JButton("1");JButton button2 = new JButton("2");JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");JButton button5 = new JButton("5");JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");JButton button8 = new JButton("8");JButton button9 = new JButton("9");
    JButton button10 = new JButton("10");JButton button11 = new JButton("11");JButton button12 = new JButton("12");
    JButton button13 = new JButton("13");JButton button14 = new JButton("14");JButton button15 = new JButton("15");
    JButton button16 = new JButton();
    JButton[] buttons = {button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16};

    JPanel[] panels = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};

    /*public void temp() {
        for(int i = 0; i < 16; i++) {
            System.out.println(slideBoardContent[0][i].toString());
        }
        for (int i = 0; i < 16; i++) {
            System.out.println(slideBoardContent[1][i]);
        }
    } */


    public SlideBoard() {
        shuffle();

        add(top, BorderLayout.NORTH);
        add(frame, BorderLayout.CENTER);
        frame.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 16; i++) {
            frame.add(panels[i]);
        }
        /*frame.add(a);frame.add(b);frame.add(c);frame.add(d);frame.add(e);frame.add(f);frame.add(g);frame.add(h);frame.add(i);
        frame.add(j);frame.add(k);frame.add(l);frame.add(m);frame.add(n);frame.add(o);frame.add(p);*/

        a.add(buttons[0]);b.add(buttons[1]);c.add(buttons[2]);d.add(buttons[3]);
        e.add(buttons[4]);f.add(buttons[5]);g.add(buttons[6]);h.add(buttons[7]);
        i.add(buttons[8]);j.add(buttons[9]);k.add(buttons[10]);l.add(buttons[11]);
        m.add(buttons[12]);n.add(buttons[13]);o.add(buttons[14]);p.add(buttons[15]);
        add(newGame, BorderLayout.SOUTH);

        setVisible(true);
        button16.setVisible(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    private void shuffle () {
        JButton temp;
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 15);
            int random2 = (int) (Math.random() * 15);
            temp = buttons[random];
            buttons[random] = buttons[random2];
            buttons[random2] = temp;
        }

    }

}
