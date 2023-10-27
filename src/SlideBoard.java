import javax.swing.*;
import java.awt.*;

public class SlideBoard extends JFrame {
    JPanel frame = new JPanel();
    JLabel top = new JLabel();
    JButton newGame = new JButton();
    JPanel a = new JPanel();JPanel b = new JPanel();JPanel c = new JPanel();JPanel d = new JPanel();JPanel e = new JPanel();
    JPanel f = new JPanel();JPanel g = new JPanel();JPanel h = new JPanel();JPanel i = new JPanel();JPanel j = new JPanel();
    JPanel k = new JPanel();JPanel l = new JPanel();JPanel m = new JPanel();JPanel n = new JPanel();JPanel o = new JPanel();
    JPanel p = new JPanel();
    JButton button1 = new JButton("1");JButton button2 = new JButton("2");JButton button3 = new JButton("3");JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");JButton button6 = new JButton("6");JButton button7 = new JButton("7");JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");JButton button10 = new JButton("10");JButton button11 = new JButton("11");JButton button12 = new JButton("12");
    JButton button13 = new JButton("13");JButton button14 = new JButton("14");JButton button15 = new JButton("15");

    public SlideBoard() {
        add(top, BorderLayout.NORTH);
        add(frame, BorderLayout.CENTER);
        frame.setLayout(new GridLayout(4, 4));
        frame.add(a);frame.add(b);frame.add(c);frame.add(d);frame.add(e);frame.add(f);frame.add(g);frame.add(h);frame.add(i);
        frame.add(j);frame.add(k);frame.add(l);frame.add(m);frame.add(n);frame.add(o);frame.add(p);
        a.add(button1);b.add(button2);c.add(button3);d.add(button4);e.add(button5);f.add(button6);g.add(button7);h.add(button8);
        i.add(button9);j.add(button10);k.add(button11);l.add(button12);m.add(button13);n.add(button14);o.add(button15);
        add(newGame, BorderLayout.SOUTH);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

    }


}
