import javax.swing.*;
import java.awt.*;

public class SwingPanel {
    public static void main(String[] args) {

        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,200,200);

        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(200,0,200,200);

        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,200,400,200);
        greenPanel.setLayout(new BorderLayout());

        ImageIcon icon = new ImageIcon("D:\\Swings\\out\\production\\Swings\\thumb.png");

        JLabel label=new JLabel();
        label.setText("Like");
        label.setIcon(icon);
        greenPanel.add(label);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame =  new JFrame();
        frame.setVisible(true);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
