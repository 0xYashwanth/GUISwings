import javax.swing.*;
public class ToolTipEx {
    public static void main(String[] args) {
        JFrame f=new JFrame("Password field ex");
        JPasswordField value=new JPasswordField();
        value.setBounds(100,100,100,30);
        value.setToolTipText("enter your password");
        JLabel l1=new JLabel("Password");
        l1.setBounds(20, 100, 80, 30);
        f.add(value);
        f.add(l1);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    
    }
}
