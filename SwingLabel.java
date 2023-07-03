import javax.swing.*;
import java.awt.*;

public class SwingLabel {
    public static void main(String[] args) {


        JLabel label =new JLabel();
        ImageIcon icon= new ImageIcon("Gojo-1068x763.jpg");
        label.setIcon(icon);
        label.setText("Gojo sensei");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x4F3CBB));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setIconTextGap(50);
        label.setBackground(Color.black);
        label.setOpaque(true);




        JFrame frame =  new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
    }

}
