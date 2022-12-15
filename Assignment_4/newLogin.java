import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Login extends JFrame implements ActionListener
{
    JFrame frame = new JFrame();
    JButton b1, b2;
    JLabel l1, l2;
    JTextField tf1, tf2;

    Login()
    {
    JLabel l1 = new JLabel("Username: ",JLabel.RIGHT);
    JTextField tf1 = new JTextField(10);
    JLabel l2 = new JLabel("Password: ",JLabel.RIGHT);
    JTextField tf2 = new JTextField(10);
    JButton b1 = new JButton("Login");
    JButton b2 = new JButton("Reset");

    JPanel p1 = new JPanel();
    p1.add(b1);
    p1.add(b2);
    p1.setLayout(new FlowLayout(FlowLayout.TRAILING,50,0));

    frame.add(l1);
    frame.add(tf1);
    frame.add(l2);
    frame.add(tf2);
    frame.add(p1);

    frame.setLayout(new FlowLayout(0,60,20));

    frame.setSize(400,200);
    frame.setTitle("Login");
    frame.setVisible(true);

    addActionEvent();
    }
    


    public void addActionEvent()
    {
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    { 
        if(e.getSource()==b1)
        {
            String userText;
            String pwdText;
            userText=tf1.getText();
            pwdText=tf2.getText();
            if(userText.equalsIgnoreCase("Pratik")&&pwdText.equalsIgnoreCase("pratik@0906"))
            {
                JOptionPane.showMessageDialog(this,"Login Successful");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Invalid Username or Password");
            }
        }
        if(e.getSource()==b2)
        {
            tf1.setText(" ");
            tf2.setText("");
        }
    }

}
public class newLogin
{
    public static void main(String[] args)
    {
        Login log = new Login();
    }
}