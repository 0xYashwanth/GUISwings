import javax.swing.*;
import java.awt.*;

public class SwingFrame {
    public static void main(String[] args) {

        JFrame jfrm = new JFrame();
        jfrm.setVisible(true);
        jfrm.setSize(400,400);
        jfrm.setResizable(false);
        jfrm.getContentPane().setBackground(new Color(123,50,250));
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("Gojo-1068x763.jpg");
        jfrm.setIconImage(icon.getImage());
    }
}
