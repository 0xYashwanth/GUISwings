import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="ButtonDemo" width=400 height=400></applet> */
public class ButtonDemo extends Applet implements ActionListener{
    String msg="";
    Button yes,no,maybe;
    public void init()
    {
        yes = new Button("Yes");
        no = new Button("No");
        maybe = new Button("Maybe");

        add(yes);
        add(no);
        add(maybe);

        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        String str=e.getActionCommand();
        //System.out.println(str);
        if(str.equals("yes"))
        {
            msg="You pressed YES";
        }
        else if(str.equals("no"))
        {
            msg="You pressed NO";
        }
        else
            msg="You pressed Maybe";

        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg, 100, 300);
    }
}
