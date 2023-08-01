import javax.swing.*;

public class JLabelDemo {
    public JLabelDemo()
    {
        JFrame jfrm = new JFrame("JLabelDemo");
        //jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(260, 210);

        ImageIcon i1 = new ImageIcon("hourglass.png");
        JLabel j1 = new JLabel("Hourglass", i1, JLabel.CENTER);
        jfrm.add(j1);
        jfrm.setVisible(true);
    }
        public static void main(String args[])
    {
        SwingUtilities.invokeLater(
            new Runnable() {
                public void run()
            {
                    new JLabelDemo();
                }
            });
    }
}