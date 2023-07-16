import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;

public class SwingsMenu {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                try 
                {
                    new SwingsMenu();
                } 
                catch (Exception e) {}
            }
        });
    }
    public SwingsMenu()
    {
        JFrame frm=new JFrame("Creating menus in Jframe");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(400,400);
        frm.setVisible(true);     
        JMenuBar menubar=new JMenuBar();
        
        JMenu filemenu=new JMenu("File");
        filemenu.add(new JSeparator());
        JMenu editmenu=new JMenu("Edit");
        editmenu.add(new JSeparator());

        JMenuItem fileitem1=new JMenuItem("New");
        JMenuItem fileitem2=new JMenuItem("Open");
        fileitem2.add(new JSeparator());
        JMenuItem fileitem3=new JMenuItem("close");
        JMenuItem fileitem4=new JMenuItem("Save");


        JMenuItem edititem1=new JMenuItem("cutt");
        JMenuItem edititem2=new JMenuItem("paste");
        JMenuItem edititem3=new JMenuItem("paste");
        edititem3.add(new JSeparator());
        JMenuItem edititem4=new JMenuItem("Insert");
        edititem4.add(new JSeparator());
        filemenu.add(fileitem1);
        filemenu.add(fileitem2);
        filemenu.add(fileitem3);
        filemenu.add(fileitem4);

        editmenu.add(edititem1);
        editmenu.add(edititem2);
        editmenu.add(edititem3);
        editmenu.add(edititem4);

        menubar.add(filemenu);
        menubar.add(editmenu);

        frm.setJMenuBar(menubar);
    }
}
