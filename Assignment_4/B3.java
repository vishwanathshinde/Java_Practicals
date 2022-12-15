import java.awt.*;
import javax.swing.*;

class calculator extends JFrame
{
    JFrame frame = new JFrame();
    calculator()
    {
        JTextField ta = new JTextField(15);
        JButton b1 = new JButton("7");
        JButton b2 = new JButton("8");
        JButton b3 = new JButton("9");
        JButton b4 = new JButton("/");
        JButton b5 = new JButton("4");
        JButton b6 = new JButton("5");
        JButton b7 = new JButton("6");
        JButton b8 = new JButton("*");
        JButton b9 = new JButton("1");
        JButton b10 = new JButton("2");
        JButton b11 = new JButton("3");
        JButton b12 = new JButton("-");
        JButton b13 = new JButton(".");
        JButton b14 = new JButton("0");
        JButton b15 = new JButton("=");
        JButton b16 = new JButton("+");
        JButton b17 = new JButton("clear");

        JPanel p = new JPanel();

        p.add(ta);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        p.add(b17);

        frame.add(p);

        frame.setSize(200,220);
        frame.setTitle("Simple Calculator");
        frame.setVisible(true);
    }
}

public class B3
{
    public static void main(String[] args)
    {
        calculator ob = new calculator();
    }
}