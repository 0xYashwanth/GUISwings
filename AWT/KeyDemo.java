import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="KeyDemo" width=500 height=500></applet> */
public class KeyDemo extends Applet implements KeyListener{
    String msg="";
    public void init()
    {
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent ke)
    {
        showStatus("key pressed");
    }
    public void keyReleased(KeyEvent ke)
    {
        showStatus("key released");
    }
    public void keyTyped(KeyEvent ke)
    {
        Font f=new Font("Monotype Corsiva",Font.BOLD,30);
        msg+=ke.getKeyChar();
        setFont(f);
        repaint();
    }
    public void paint(Graphics g)
    {
        this.setSize(500, 500);
        g.drawString(msg, 30, 30);
    }
}
