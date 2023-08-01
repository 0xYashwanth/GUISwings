import javax.swing.*;

public class JTableDemo {
    String[] colHeads = { "Name", "Extension", "|D#" };
    Object[][] data = {
            { "Gail", "4567", "865" },
            { "Ken", "7556", "555" },
            { "Viviane", "5634", "314" },
            { "Melanie", "7345", "922" },
    };
    public JTableDemo()
    {
        JFrame jfrm = new JFrame("JTableDemo");
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(300, 300);

        JTable table = new JTable(data, colHeads);
        jfrm.add(table);
        jfrm.setVisible(true);
    }
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                new JTableDemo();
            }
        });
    }
}