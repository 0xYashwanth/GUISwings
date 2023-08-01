import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class JButtonDemo implements ActionListener {

    public JButtonDemo() {

        JFrame jfrm = new JFrame("JButtonDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jfrm.setSize(500, 450);

        ImageIcon i1 = new ImageIcon("C:\\Users\\yashw\\Downloads\\hourglass.jpg");
        JButton jb = new JButton(i1);
        jb.setActionCommand("Hourglass");

        jb.addActionListener(this);

        jfrm.add(jb);

        ImageIcon i2 = new ImageIcon(":\\Users\\yashw\\Downloads\\hourglass.jpg");
        jb = new JButton(i2);
        jb.setActionCommand("Analog Clock");

        jb.addActionListener(this);

        jfrm.add(jb);

        ImageIcon i3 = new ImageIcon("C:\\Users\\yashw\\Downloads\\hourglass.jpg");
        jb = new JButton(i3);
        jb.setActionCommand("Digital Clock");
        jb.addActionListener(this);

        jfrm.add(jb);

        ImageIcon i4 = new ImageIcon("C:\\Users\\yashw\\Downloads\\hourglass.jpg");
        jb = new JButton(i4);
        jb.setActionCommand("stop watch");
        jb.addActionListener(this);

        jfrm.add(jb);

        JLabel jlab = new JLabel("Choose a Timepiece");
        jfrm.add(jlab);
        jfrm.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae)

    {
        // JLabel jlab;
        // jlab.setText("you selected" +ae.getActionCommand());

    }

    public static void main(String args[]) {

        SwingUtilities.invokeLater(

                new Runnable() {

                    public void run()

                {

                        new JButtonDemo();

                    }
                });
    }
}