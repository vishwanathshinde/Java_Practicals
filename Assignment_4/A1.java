import java.awt.*;
import javax.swing.*;

class Login extends JFrame
{
    TextField username, pass;
    Button b1, b2;
    Login()
    {
        Label n = new Label("Username: ", Label.RIGHT);
        Label m = new Label("Password: ",Label.RIGHT);
        username = new TextField(20);
        pass = new TextField(20);
        b1 = new Button("Login");
        b2 = new Button("Reset");

        add(n);
        add(username);
        add(m);
        add(pass);
        add(b1);
        add(b2);
        setLayout(new FlowLayout(0,60,20));

        setSize(400,300);
        setTitle("Login");
        setVisible(true);
    }
}

public class A1
{
    public static void main(String[] args)
    {
        Login l1 = new Login();
    }
}