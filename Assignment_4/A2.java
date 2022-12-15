import java.awt.*;
import javax.swing.*;

class Vaccination extends JFrame
{
    JFrame frame = new JFrame();

    Vaccination()
    {
        frame.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Vaccination Details",JLabel.CENTER);
        JLabel l2 = new JLabel("Name: ");
        JTextField t1 = new JTextField(40);
        JLabel l3 = new JLabel("Dose");
        JCheckBox cb1 = new JCheckBox("1st Dose",false);
        JCheckBox cb2 = new JCheckBox("2nd Dose",false);
        JCheckBox cb3 = new JCheckBox("nice",false);
        JLabel l4 = new JLabel("Vaccine");
        JRadioButton rb1 = new JRadioButton("Covishield",false);
        JRadioButton rb2 = new JRadioButton("Covaxin",false);
        JRadioButton rb3 = new JRadioButton("Sputnik V",false);
        JTextArea tr = new JTextArea("Name:______________________ 1st Dose:______________2nd Dose:_________\nVaccine:_______________________");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(4,1,250,2));
        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(4,1,250,2));
        JPanel p5 = new JPanel();


        p1.add(l1);
        p2.add(l2);
        p2.add(t1);
        p3.add(l3);
        p3.add(cb1);
        p3.add(cb2);
        p4.add(l4);
        p4.add(rb1);
        p4.add(rb2);
        p4.add(rb3);
        p5.add(tr);

        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);
        frame.add(p5);

        frame.setSize(500,300);
        frame.setTitle("Vaccination Details");
        frame.setVisible(true);
    }
}

public class A2
{
    public static void main(String[] args)
    {
        Vaccination v = new Vaccination();
    }
}